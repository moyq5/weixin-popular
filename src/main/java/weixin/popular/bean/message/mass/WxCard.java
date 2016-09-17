/**
 * 
 */
package weixin.popular.bean.message.mass;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 群发－卡券信息
 * @author Moyq5
 * @date 2016年9月17日
 */
public class WxCard {

	/**
	 * 卡券ID<br>
	 * 必填
	 */
	@JsonProperty("card_id")
	private String cardId;

	/**
	 * 卡券ID<br>
	 * 必填
	 * @return 卡券ID
	 */
	public String getCardId() {
		return cardId;
	}

	/**
	 * 卡券ID<br>
	 * 必填
	 * @param cardId 卡券ID
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

}
