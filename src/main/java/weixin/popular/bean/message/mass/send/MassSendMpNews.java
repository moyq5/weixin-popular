/**
 * 
 */
package weixin.popular.bean.message.mass.send;

import java.util.List;

import weixin.popular.bean.message.mass.MpNewsData;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 根据OpenID列表群发－请求参数（图文消息）
 * @author Moyq5
 * @date 2016年9月17日
 */
public class MassSendMpNews extends MpNewsData {

	/**
	 * 消息的接收者，一串OpenID列表，OpenID最少2个，最多10000个<br>
	 * 必填
	 */
	@JsonProperty("touser")
	private List<String> toUser;
	
	/**
	 * 消息的接收者，一串OpenID列表，OpenID最少2个，最多10000个<br>
	 * 必填
	 * @return 消息的接收者OpenID列表
	 */
	public List<String> getToUser() {
		return toUser;
	}

	/**
	 * 消息的接收者，一串OpenID列表，OpenID最少2个，最多10000个<br>
	 * 必填
	 * @param toUser 消息的接收者OpenID列表
	 */
	public void setToUser(List<String> toUser) {
		this.toUser = toUser;
	}

}
