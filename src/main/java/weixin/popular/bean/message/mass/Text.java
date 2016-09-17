/**
 * 
 */
package weixin.popular.bean.message.mass;


/**
 * 群发－文本信息
 * @author Moyq5
 * @date 2016年9月17日
 */
public class Text {

	/**
	 * 要发送的文本内容<br>
	 * 必填
	 */
	private String content;

	/**
	 * 要发送的文本内容<br>
	 * 必填
	 * @return 要发送的文本内容O
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 要发送的文本内容<br>
	 * 必填
	 * @param content 要发送的文本内容
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
