/**
 * 
 */
package weixin.popular.bean.message.mass.preview;

import weixin.popular.bean.message.mass.TextData;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 群发预览接口－请求参数（文本消息）
 * @author Moyq5
 * @date 2016年9月18日
 */
public class MassPreviewText extends TextData {

	/**
	 * 接收消息用户对应该公众号的openid（或者使用toWxName参数，以实现对微信号的预览，以toWxName优先）
	 */
	@JsonProperty("touser")
	private String toUser;
	
	/**
	 * 接收消息用户微信号（或者使用toUser参数，以实现对应该公众号的openid的预览，以toWxName优先）
	 */
	@JsonProperty("towxname")
	private String toWxName;

	/**
	 * 接收消息用户对应该公众号的openid（或者使用toWxName参数，以实现对微信号的预览，以toWxName优先）
	 * @return 用户对应该公众号的openid
	 */
	public String getToUser() {
		return toUser;
	}

	/**
	 * 接收消息用户对应该公众号的openid（或者使用toWxName参数，以实现对微信号的预览，以toWxName优先）
	 * @param toUser 用户对应该公众号的openid
	 */
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	/**
	 * 接收消息用户微信号（或者使用toUser参数，以实现对应该公众号的openid的预览，以toWxName优先）
	 * @return 用户微信号
	 */
	public String getToWxName() {
		return toWxName;
	}

	/**
	 * 接收消息用户微信号（或者使用toUser参数，以实现对应该公众号的openid的预览，以toWxName优先）
	 * @param toWxName 用户微信号
	 */
	public void setToWxName(String toWxName) {
		this.toWxName = toWxName;
	}
	
}
