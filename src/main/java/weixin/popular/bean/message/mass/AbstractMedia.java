/**
 * 
 */
package weixin.popular.bean.message.mass;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 媒体素材信息抽象类
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class AbstractMedia {

	/**
	 * 用于群发的消息的media_id<br>
	 * 必填
	 */
	@JsonProperty("media_id")
	private String mediaId;

	/**
	 * 用于群发的消息的media_id<br>
	 * 必填
	 * @return the mediaId
	 */
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * 用于群发的消息的media_id<br>
	 * 必填
	 * @param mediaId 用于群发的消息的media_id
	 */
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
