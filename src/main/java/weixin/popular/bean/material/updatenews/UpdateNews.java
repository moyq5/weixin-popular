/**
 * 
 */
package weixin.popular.bean.material.updatenews;

import weixin.popular.bean.material.addnews.Article;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 修改永久图文素材－请求参数
 * @author Moyq5
 * @date 2016年9月22日
 */
public class UpdateNews {

	/**
	 * 素材的media_id<br>
	 * 必填
	 */
	@JsonProperty("media_id")
	private String mediaId;
	
	/**
	 * 要更新的文章在图文消息中的位置（多图文消息时，此字段才有意义），第一篇为0<br>
	 * 必填
	 */
	private Integer index;
	
	/**
	 * 文章
	 */
	private Article articles;

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
	 * 要更新的文章在图文消息中的位置（多图文消息时，此字段才有意义），第一篇为0<br>
	 * 必填
	 * @return 要更新的文章索引
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * 要更新的文章在图文消息中的位置（多图文消息时，此字段才有意义），第一篇为0<br>
	 * 必填
	 * @param index 要更新的文章索引
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * @return 新的文章
	 */
	public Article getArticles() {
		return articles;
	}

	/**
	 * @param articles 新的文章
	 */
	public void setArticles(Article articles) {
		this.articles = articles;
	}
}
