/**
 * 
 */
package weixin.popular.bean.material.addnews;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 新增永久图文素材－响应参数
 * @author Moyq5
 * @date 2016年9月11日
 */
public class AddNewsResult extends BaseResult {

	/**
	 * 新增的图文消息素材的media_id
	 */
	@JsonProperty("media_id")
	private String mediaId;

	/**
	 * @return 新增的图文消息素材的media_id
	 */
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * @param mediaId 新增的图文消息素材的media_id
	 */
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
