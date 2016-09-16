package weixin.popular.bean.material.addnews;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 图文消息（文章）
 * @author Moyq5
 * @date 2016年9月11日
 */
public class Article {

	/**
	 * 标题<br>
	 * 添加必填
	 */
    private String title;
    
    /**
     * 图文消息的封面图片素材id（必须是永久mediaID）<br>
     * 添加必填
     */
    @JsonProperty("thumb_media_id")
	private String thumbMediaId;
    
    /**
     * 作者<br>
     * 添加必填
     */
    private String author;
    
    /**
     * 图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空
     */
    private String digest;
    
    /**
     * 是否显示封面，0为false，即不显示，1为true，即显示<br>
     * 添加必填
     */
    @JsonProperty("show_cover_pic")
	private Integer showCoverPic;
    
    /**
     * 图文消息的具体内容，支持HTML标签，必须少于2万字符，小于1M，且此处会去除JS<br>
     * 添加必填
     */
    private String content;
    
    /**
     * 图文消息的原文地址，即点击“阅读原文”后的URL<br>
     * 添加必填
     */
    @JsonProperty("content_source_url")
	private String contentSourceUrl;

	/**
	 * 标题<br>
	 * 添加必填
	 * @return 标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 标题<br>
	 * 添加必填
	 * @param title 标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 图文消息的封面图片素材id（必须是永久mediaID）<br>
     * 添加必填
	 * @return 封面图片素材id
	 */
	public String getThumbMediaId() {
		return thumbMediaId;
	}

	/**
	 * 图文消息的封面图片素材id（必须是永久mediaID）<br>
     * 添加必填
	 * @param thumbMediaId 封面图片素材id
	 */
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	/**
	 * 作者<br>
     * 添加必填
	 * @return 作者
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 作者<br>
     * 添加必填
	 * @param author 作者
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空
	 * @return 图文消息的摘要
	 */
	public String getDigest() {
		return digest;
	}

	/**
	 * 图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空
	 * @param digest 图文消息的摘要
	 */
	public void setDigest(String digest) {
		this.digest = digest;
	}

	/**
	 * 是否显示封面，0为false，即不显示，1为true，即显示<br>
     * 添加必填
	 * @return 是否显示封面
	 */
	public Integer getShowCoverPic() {
		return showCoverPic;
	}

	/**
	 * 是否显示封面，0为false，即不显示，1为true，即显示<br>
     * 添加必填
	 * @param showCoverPic 是否显示封面
	 */
	public void setShowCoverPic(Integer showCoverPic) {
		this.showCoverPic = showCoverPic;
	}

	/**
	 * 图文消息的具体内容，支持HTML标签，必须少于2万字符，小于1M，且此处会去除JS<br>
     * 添加必填
	 * @return 图文消息的具体内容
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 图文消息的具体内容，支持HTML标签，必须少于2万字符，小于1M，且此处会去除JS<br>
     * 添加必填
	 * @param content 图文消息的具体内容
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 图文消息的原文地址，即点击“阅读原文”后的URL<br>
     * 添加必填
	 * @return 图文消息的原文地址
	 */
	public String getContentSourceUrl() {
		return contentSourceUrl;
	}

	/**
	 * 图文消息的原文地址，即点击“阅读原文”后的URL<br>
     * 添加必填
	 * @param contentSourceUrl 图文消息的原文地址
	 */
	public void setContentSourceUrl(String contentSourceUrl) {
		this.contentSourceUrl = contentSourceUrl;
	}
    
}
