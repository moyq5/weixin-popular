/**
 * 
 */
package weixin.popular.bean.material.addmaterial;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 新增其他类型永久素材－响应参数
 * @author Moyq5
 * @date 2016年9月9日
 */
public class AddMaterialResult extends BaseResult {

	/**
	 * 素材的media_id
	 */
	@JsonProperty("media_id")
	private String mediaId;
	
	/**
	 * 素材的图片URL（仅新增图片素材时会返回该字段）
	 */
	private String url;

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

	/**
	 * 素材的图片URL（仅新增图片素材时会返回该字段）
	 * @return 素材的图片URL
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 素材的图片URL（仅新增图片素材时会返回该字段）
	 * @param url 素材的图片URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
