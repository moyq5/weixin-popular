/**
 * 
 */
package weixin.popular.bean.message.mass;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群发－请求参数（抽象类）
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class AbstractMassSend {

	/**
	 * 群发的消息类型，图文消息为mpnews，文本消息为text，语音为voice，音乐为music，图片为image，视频为video，卡券为wxcard<br>
	 * 必填
	 */
	@JsonProperty("msgtype")
	protected String msgType;

	/**
	 * 群发的消息类型，图文消息为mpnews，文本消息为text，语音为voice，音乐为music，图片为image，视频为video，卡券为wxcard<br>
	 * 必填
	 * @return 群发的消息类型
	 */
	public String getMsgType() {
		return msgType;
	}

	/**
	 * 群发的消息类型，图文消息为mpnews，文本消息为text，语音为voice，音乐为music，图片为image，视频为video，卡券为wxcard<br>
	 * 必填
	 * @param msgType 群发的消息类型
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

}
