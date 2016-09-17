/**
 * 
 */
package weixin.popular.bean.message.mass.delete;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 删除群发－请求参数<br>
 * 1、只有已经发送成功的消息才能删除
 * 2、删除消息是将消息的图文详情页失效，已经收到的用户，还是能在其本地看到消息卡片。
 * 3、删除群发消息只能删除图文消息和视频消息，其他类型的消息一经发送，无法删除。
 * 4、如果多次群发发送的是一个图文消息，那么删除其中一次群发，就会删除掉这个图文消息也，导致所有群发都失效
 * @author Moyq5
 * @date 2016年9月17日
 */
public class MassDelete {

	/**
	 * 发送出去的消息ID
	 */
	@JsonProperty("msg_id")
	private Long msgId;

	/**
	 * @return 发送出去的消息ID
	 */
	public Long getMsgId() {
		return msgId;
	}

	/**
	 * @param msgId 发送出去的消息ID
	 */
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
}
