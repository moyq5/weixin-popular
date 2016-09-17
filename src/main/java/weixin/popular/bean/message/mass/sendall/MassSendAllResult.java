/**
 * 
 */
package weixin.popular.bean.message.mass.sendall;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 根据标签进行群发－响应参数
 * @author Moyq5
 * @date 2016年9月17日
 */
public class MassSendAllResult extends BaseResult {

	/**
	 * 消息发送任务的ID
	 */
	@JsonProperty("msg_id")
	private Long msgId;
	
	/**
	 * 消息的数据ID，，该字段只有在群发图文消息时，才会出现。<br>
	 * 可以用于在图文分析数据接口中，获取到对应的图文消息的数据，是图文分析数据接口中的msgid字段中的前半部分，详见图文分析数据接口中的msgid字段的介绍
	 */
	@JsonProperty("msg_data_id")
	private Long msgDataId;

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

	/**
	 * 消息的数据ID，该字段只有在群发图文消息时，才会出现。<br>
	 * 可以用于在图文分析数据接口中，获取到对应的图文消息的数据，是图文分析数据接口中的msgid字段中的前半部分，详见图文分析数据接口中的msgid字段的介绍
	 * @return 消息的数据ID
	 */
	public Long getMsgDataId() {
		return msgDataId;
	}

	/**
	 * 消息的数据ID，该字段只有在群发图文消息时，才会出现。<br>
	 * 可以用于在图文分析数据接口中，获取到对应的图文消息的数据，是图文分析数据接口中的msgid字段中的前半部分，详见图文分析数据接口中的msgid字段的介绍
	 * @param msgDataId 消息的数据ID
	 */
	public void setMsgDataId(Long msgDataId) {
		this.msgDataId = msgDataId;
	}
}
