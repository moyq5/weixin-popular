package weixin.popular.bean.menu.trymatch;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 测试个性化菜单匹配结果－请求参数
 * @author Moyq5
 * @date 2016年9月15日
 */
public class TryMatch {

	/**
	 * user_id可以是粉丝的OpenID，也可以是粉丝的微信号。
	 */
	@JsonProperty("user_id")
	private String userId;

	/**
	 * user_id可以是粉丝的OpenID，也可以是粉丝的微信号。
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * user_id可以是粉丝的OpenID，也可以是粉丝的微信号。
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
