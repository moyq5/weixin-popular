/**
 * 
 */
package weixin.popular.bean.tags.getidlist;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取用户身上的标签列表－请求参数
 * @author Moyq5
 * @date 2017年2月16日
 */
public class GetIdList {

	/**
	 * 粉丝openId
	 */
	@JsonProperty("openid")
	private String openId;

	/**
	 * @return 粉丝openId
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * @param openId 粉丝openId
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
}
