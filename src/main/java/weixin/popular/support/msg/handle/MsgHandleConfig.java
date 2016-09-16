package weixin.popular.support.msg.handle;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息处理配置类
 * 
 * @author Moyq5
 *
 */
public abstract class MsgHandleConfig {

	private static Replyer replyer = null;
	private static Converter converter = new DefaultConverter();
	private static Map<String, MsgType> msgTypes = new HashMap<String, MsgType>();
	private static Map<String, EventType> events = new HashMap<String, EventType>();

	public static Replyer getReplyer() {
		return replyer;
	}
	
	public static void setReplyer(Replyer replyer) {
		MsgHandleConfig.replyer = replyer;
	}

	public static Converter getConverter() {
		return converter;
	}

	/**
	 * 指定xml字符和java对象之间转换的实现<br>
	 * 默认为DefaultReplyer，使用了fastxml jackson实现
	 * @author Moyq5
	 * @date 2016年9月16日
	 * @param converter
	 */
	public static void setConverter(Converter converter) {
		MsgHandleConfig.converter = converter;
	}

	/**
	 * 添加普通消息处理类型，只有在这里添加相应的类型，才会执行相应消息的处理（即调用Replyer的相应方法，需要您定义自己的Replyer实现类）
	 * @author Moyq5
	 * @date 2016年9月16日
	 * @param type
	 */
	public static void addType(MsgType type) {
		msgTypes.put(type.getMsgType(), type);
	}

	/**
	 * 添加事件消息处理类型，只有在这里添加相应的类型，才会执行相应消息的处理（即调用Replyer的相应方法，需要您定义自己的Replyer实现类）
	 * @author Moyq5
	 * @date 2016年9月16日
	 * @param type
	 */
	public static void addType(EventType type) {
		events.put(type.getEvent(), type);
	}

	/**
	 * 清除普通消息处理类型
	 * @author Moyq5
	 * @date 2016年9月16日
	 */
	public static void clearMsgTypes() {
		msgTypes.clear();
	}

	/**
	 * 清除事件消息处理类型
	 * @author Moyq5
	 * @date 2016年9月16日
	 */
	public static void clearEventTypes() {
		events.clear();
	}
	

	public static Map<String, MsgType> getMsgTypes() {
		return msgTypes;
	}

	public static Map<String, EventType> getEventTypes() {
		return events;
	}

}
