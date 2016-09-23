/**
 * 
 */
package weixin.popular.bean.message.mass.preview;

import weixin.popular.bean.message.mass.AbstractMassSend;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 群发－卡券消息参数
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class WxCardData extends AbstractMassSend {

	public WxCardData() {
		this.msgType = "wxcard";
	}
	
	/**
	 * 要发送的卡券信息<br>
	 * 必填
	 */
	@JsonProperty("wxcard")
	private WxCard wxCard;

	/**
	 * 要发送的卡券信息<br>
	 * 必填
	 * @return 要发送的卡券信息
	 */
	public WxCard getWxCard() {
		return wxCard;
	}

	/**
	 * 要发送的卡券信息<br>
	 * 必填
	 * @param wxCard 要发送的卡券信息
	 */
	public void setWxCard(WxCard wxCard) {
		this.wxCard = wxCard;
	}

}
