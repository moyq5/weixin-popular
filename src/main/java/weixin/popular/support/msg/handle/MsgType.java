package weixin.popular.support.msg.handle;

import weixin.popular.support.msg.beans.receive.Msg;
import weixin.popular.support.msg.beans.receive.MsgImage;
import weixin.popular.support.msg.beans.receive.MsgLink;
import weixin.popular.support.msg.beans.receive.MsgLocation;
import weixin.popular.support.msg.beans.receive.MsgShortVideo;
import weixin.popular.support.msg.beans.receive.MsgText;
import weixin.popular.support.msg.beans.receive.MsgVideo;
import weixin.popular.support.msg.beans.receive.MsgVoice;

/**
 * 消息类型
 * 
 * @author Moyq5
 *
 */
public enum MsgType {
	/**
	 * 文本消息
	 */
	TEXT("text", MsgText.class),
	/**
	 * 图片消息
	 */
	IMAGE("image", MsgImage.class),
	/**
	 * 视频消息
	 */
	VIDEO("video", MsgVideo.class),
	/**
	 * 语音消息
	 */
	VOICE("voice", MsgVoice.class),
	/**
	 * 短视频消息
	 */
	SHORT_VIDEO("shortvideo", MsgShortVideo.class),
	/**
	 * 地理位置消息
	 */
	LOCATION("location", MsgLocation.class),
	/**
	 * 链接消息
	 */
	LINK("link", MsgLink.class),
	/**
	 * 事件消息
	 */
	EVENT("event", null);

	private Class<? extends Msg> msgClass;
	private String msgType;
	
	MsgType(String msgType, Class<? extends Msg> msgClass) {
		this.msgType = msgType;
		this.msgClass = msgClass;
	}

	public Class<? extends Msg> getMsgClass() {
		return msgClass;
	}

	public String getMsgType() {
		return msgType;
	}

}
