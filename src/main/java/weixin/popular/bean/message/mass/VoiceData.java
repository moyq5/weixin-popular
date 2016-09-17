/**
 * 
 */
package weixin.popular.bean.message.mass;

import weixin.popular.bean.message.mass.Voice;


/**
 * 群发－语音消息参数
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class VoiceData extends AbstractMassSend {

	public VoiceData() {
		this.msgType = "voice";
	}
	
	/**
	 * 要发送的语音信息<br>
	 * 必填
	 */
	private Voice voice;

	/**
	 * 要发送的语音信息<br>
	 * 必填
	 * @return 要发送的语音信息
	 */
	public Voice getVoice() {
		return voice;
	}

	/**
	 * 要发送的语音信息<br>
	 * 必填
	 * @param voice 要发送的语音信息
	 */
	public void setVoice(Voice voice) {
		this.voice = voice;
	}

}
