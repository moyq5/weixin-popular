/**
 * 
 */
package weixin.popular.bean.message.mass;

import weixin.popular.bean.message.mass.MpVideo;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 群发－视频消息参数
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class MpVideoData extends AbstractMassSend {

	public MpVideoData() {
		this.msgType = "mpvideo";
	}
	
	/**
	 * 要发送的视频信息<br>
	 * 必填
	 */
	@JsonProperty("mpvideo")
	private MpVideo mpVideo;

	/**
	 * 要发送的视频信息<br>
	 * 必填
	 * @return 要发送的视频信息
	 */
	public MpVideo getMpVideo() {
		return mpVideo;
	}

	/**
	 * 要发送的视频信息<br>
	 * 必填
	 * @param mpVideo 要发送的视频信息
	 */
	public void setMpVideo(MpVideo mpVideo) {
		this.mpVideo = mpVideo;
	}

}
