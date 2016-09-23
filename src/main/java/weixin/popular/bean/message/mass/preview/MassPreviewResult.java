/**
 * 
 */
package weixin.popular.bean.message.mass.preview;

import weixin.popular.bean.BaseResult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群发预览接口－响应参数
 * @author Moyq5
 * @date 2016年9月18日
 */
public class MassPreviewResult extends BaseResult {

	/**
	 * 消息发送任务的ID
	 */
	@JsonProperty("msg_id")
	private Long msgId;

	/**
	 * @return 消息发送任务的ID
	 */
	public Long getMsgId() {
		return msgId;
	}

	/**
	 * @param msgId 消息发送任务的ID
	 */
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	
}
