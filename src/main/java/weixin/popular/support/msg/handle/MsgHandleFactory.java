package weixin.popular.support.msg.handle;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import weixin.popular.support.msg.beans.receive.MsgE;

public abstract class MsgHandleFactory {

	private static Logger log = LoggerFactory.getLogger(MsgHandleFactory.class);

	public static String handle(String appId, String receiveMsg) {
		String result = null;

		// 消息处理实现
		Replyer replyer = MsgHandleConfig.getReplyer();
		if (null == replyer) {
			log.debug("微信消息被直接忽略，如有需要，请通过MsgHandleConfig.setReplyer方法指定自己的消息处理功能");
			return result;
		}

		MsgE msg = MsgHandleConfig.getConverter().toObject(MsgE.class,
				receiveMsg);

		MsgType msgType = null;
		EventType event = null;
		String typeName = null;
		Class<?> msgClass = null;

		if (null != (msgType = MsgHandleConfig.getMsgTypes().get(
				msg.getMsgType()))) {

			typeName = msgType.name();
			msgClass = msgType.getMsgClass();

		} else if (null != (event = MsgHandleConfig.getEvents().get(
				msg.getEvent()))) {

			typeName = event.name();
			msgClass = event.getMsgClass();

		}

		if (null == msgClass) {
			log.debug("忽略微信消息[msgType={}, event={}]："
					+ "如有需要，可通过MsgHandleConfig.addHandleType方法开启相应的消息处理功能",
					msg.getMsgType(), msg.getEvent());
			return result;
		}

		// 组装获取Replyer对应的方法名
		String[] words = typeName.toLowerCase().split("_", -1);
		StringBuffer name = new StringBuffer();
		name.append(words[0]);
		for (int i = 1; i < words.length; i++) {
			name.append(words[i].substring(0, 1).toUpperCase()
					+ words[i].substring(1));
		}

		try {
			// 消息对象
			Object msgObj = MsgHandleConfig.getConverter().toObject(msgClass,
					receiveMsg);

			// 调用消息处理方法
			Method method = replyer.getClass().getMethod(name.toString(),
					String.class, msgClass);
			method.setAccessible(true);
			result = (String) method.invoke(replyer, appId, msgObj);
		} catch (Exception e) {
			log.error("微信消息处理异常：", e);
		}
		return result;
	}

}
