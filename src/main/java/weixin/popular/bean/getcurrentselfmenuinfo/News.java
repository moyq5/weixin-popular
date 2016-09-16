package weixin.popular.bean.getcurrentselfmenuinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取自定义菜单配置接口－响应参数－菜单信息－按钮信息－图文信息－图文详情
 * @author Moyq5
 * @date 2016年9月16日
 */
public class News {

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 作者
	 */
	private String author;

	/**
	 * 摘要
	 */
	private String digest;

	/**
	 * 是否显示封面，0为不显示，1为显示
	 */
	@JsonProperty("show_cover")
	private Integer showCover;

	/**
	 * 封面图片的URL
	 */
	@JsonProperty("cover_url")
	private String coverUrl;

	/**
	 * 正文的URL
	 */
	@JsonProperty("content_url")
	private String contentUrl;

	/**
	 * 原文的URL，若置空则无查看原文入口
	 */
	@JsonProperty("source_url")
	private String sourceUrl;

	/**
	 * @return 标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title 标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return 作者
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author 作者
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return 摘要
	 */
	public String getDigest() {
		return digest;
	}

	/**
	 * @param digest 摘要
	 */
	public void setDigest(String digest) {
		this.digest = digest;
	}

	/**
	 * 是否显示封面，0为不显示，1为显示
	 * @return 是否显示封面
	 */
	public Integer getShowCover() {
		return showCover;
	}

	/**
	 * 是否显示封面，0为不显示，1为显示
	 * @param showCover 是否显示封面
	 */
	public void setShowCover(Integer showCover) {
		this.showCover = showCover;
	}

	/**
	 * @return 封面图片的URL
	 */
	public String getCoverUrl() {
		return coverUrl;
	}

	/**
	 * @param coverUrl 封面图片的URL
	 */
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	/**
	 * @return 正文的URL
	 */
	public String getContentUrl() {
		return contentUrl;
	}

	/**
	 * @param contentUrl 正文的URL
	 */
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	/**
	 * 原文的URL，若置空则无查看原文入口
	 * @return 原文的URL
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * 原文的URL，若置空则无查看原文入口
	 * @param sourceUrl 原文的URL
	 */
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

}
