/**
 * 
 */
package weixin.popular.bean.message.mass;

import weixin.popular.bean.message.mass.Text;


/**
 * 群发－文本消息参数
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class TextData extends AbstractMassSend {

	public TextData() {
		this.msgType = "text";
	}
	
	/**
	 * 要发送的文本信息<br>
	 * 必填
	 */
	private Text text;

	/**
	 * 要发送的文本信息<br>
	 * 必填
	 * @return 文本信息
	 */
	public Text getText() {
		return text;
	}

	/**
	 * 要发送的文本消息<br>
	 * 必填
	 * @param text 文本信息
	 */
	public void setText(Text text) {
		this.text = text;
	}
}
