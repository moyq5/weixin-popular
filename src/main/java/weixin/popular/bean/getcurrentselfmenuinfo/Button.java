package weixin.popular.bean.getcurrentselfmenuinfo;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 获取自定义菜单配置接口－响应参数－菜单信息－一级菜单按钮信息
 * @author Moyq5
 * @date 2016年9月16日
 */
public class Button {

	/**
	 * 菜单名称
	 */
	private String name;
	
	/**
	 * 菜单的类型，<br>
	 * 公众平台官网上能够设置的菜单类型有view（跳转网页）、text（返回文本，下同）、img、photo、video、voice。<br>
	 * 使用API设置的则有8种，详见《自定义菜单创建接口》
	 */
	private String type;
	
	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 */
	private String key;
	
	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 */
	private String url;
	
	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 */
	private String value;
	
	/**
	 * 图文消息的信息
	 */
	@JsonProperty("news_info")
	private NewsInfo newsInfo;

	/**
	 * 子菜单按钮信息
	 */
	@JsonProperty("sub_button")
	private SubButton subButton;

	/**
	 * @return 菜单名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 菜单名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 菜单的类型，<br>
	 * 公众平台官网上能够设置的菜单类型有view（跳转网页）、text（返回文本，下同）、img、photo、video、voice。<br>
	 * 使用API设置的则有8种，详见《自定义菜单创建接口》
	 * @return 菜单的类型
	 */
	public String getType() {
		return type;
	}

	/**
	 * 菜单的类型，<br>
	 * 公众平台官网上能够设置的菜单类型有view（跳转网页）、text（返回文本，下同）、img、photo、video、voice。<br>
	 * 使用API设置的则有8种，详见《自定义菜单创建接口》
	 * @param type 菜单的类型
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 对于不同的菜单类型，value的值意义不同。官网上设置的自定义菜单：<br>
	 * Text:保存文字到value； Img、voice：保存mediaID到value； Video：保存视频下载链接到value； News：保存图文消息到news_info，同时保存mediaID到value； View：保存链接到url。<br>
	 * 使用API设置的自定义菜单： click、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、 pic_weixin、location_select：保存值到key；view：保存链接到url
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return 图文消息的信息
	 */
	public NewsInfo getNewsInfo() {
		return newsInfo;
	}

	/**
	 * @param newsInfo 图文消息的信息
	 */
	public void setNewsInfo(NewsInfo newsInfo) {
		this.newsInfo = newsInfo;
	}

	/**
	 * @return 子菜单按钮信息
	 */
	public SubButton getSubButton() {
		return subButton;
	}

	/**
	 * @param subButton 子菜单按钮信息
	 */
	public void setSubButton(SubButton subButton) {
		this.subButton = subButton;
	}

}
