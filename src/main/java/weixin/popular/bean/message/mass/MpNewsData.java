/**
 * 
 */
package weixin.popular.bean.message.mass;

import weixin.popular.bean.message.mass.MpNews;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群发－图文消息参数
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class MpNewsData extends AbstractMassSend {

	public MpNewsData() {
		this.msgType = "mpnews";
	}
	
	/**
	 * 用于设定即将发送的图文消息<br>
	 * 必填
	 */
	@JsonProperty("mpnews")
	private MpNews mpNews;

	/**
	 * 用于设定即将发送的图文消息<br>
	 * 必填
	 * @return 图文消息
	 */
	public MpNews getMpNews() {
		return mpNews;
	}

	/**
	 * 用于设定即将发送的图文消息<br>
	 * 必填
	 * @param mpNews 图文消息
	 */
	public void setMpNews(MpNews mpNews) {
		this.mpNews = mpNews;
	}
}
