/**
 * 
 */
package weixin.popular.bean.material.delmaterial;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 删除永久素材－请求参数
 * @author Moyq5
 * @date 2016年9月22日
 */
public class DelMaterial {

	/**
	 * 素材的media_id
	 */
	@JsonProperty("media_id")
	private String mediaId;

	/**
	 * @return 素材的media_id
	 */
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * @param mediaId 素材的media_id
	 */
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
