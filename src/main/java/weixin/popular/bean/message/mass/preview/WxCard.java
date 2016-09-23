/**
 * 
 */
package weixin.popular.bean.message.mass.preview;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 群发－卡券信息
 * @author Moyq5
 * @date 2016年9月17日
 */
public class WxCard extends weixin.popular.bean.message.mass.WxCard {

	@JsonProperty("card_ext")
	private String cardExt;

	/**
	 * @return the cardExt
	 */
	public String getCardExt() {
		return cardExt;
	}

	/**
	 * @param cardExt the cardExt to set
	 */
	public void setCardExt(String cardExt) {
		this.cardExt = cardExt;
	}
}
