/**
 * 
 */
package weixin.popular.bean.menu.create;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 菜单按钮
 * 
 * @author Moyq5
 * @date 2016年9月12日
 */
public class Button {

	/**
	 * 菜单的响应动作类型<br>
	 * 必填
	 */
	private String type;
	
	/**
	 * 菜单标题，不超过16个字节，子菜单不超过60个字节<br>
	 * 必填
	 */
	private String name;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节<br>
	 * click等点击类型必须
	 */
	private String key;
	
	/**
	 * 网页链接，用户点击菜单可打开链接，不超过1024字节<br>
	 * view类型必须
	 */
	private String url;
	
	/**
	 * 调用新增永久素材接口返回的合法media_id<br>
	 * media_id类型和view_limited类型必须
	 */
	@JsonProperty("media_id")
	private String mediaId;
	
	/**
	 * 二级菜单数组，个数应为1~5个
	 */
	@JsonProperty("sub_button")
	private List<Button> subButton;

	/**
	 * 菜单的响应动作类型<br>
	 * 必填
	 * @return 菜单的响应动作类型
	 */
	public String getType() {
		return type;
	}

	/**
	 * 菜单的响应动作类型<br>
	 * 必填
	 * @param type 菜单的响应动作类型
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 菜单标题，不超过16个字节，子菜单不超过60个字节<br>
	 * 必填
	 * @return 菜单标题
	 */
	public String getName() {
		return name;
	}

	/**
	 * 菜单标题，不超过16个字节，子菜单不超过60个字节<br>
	 * 必填
	 * @param name 菜单标题
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节<br>
	 * click等点击类型必须
	 * @return 菜单KEY值
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节<br>
	 * click等点击类型必须
	 * @param key 菜单KEY值
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 网页链接，用户点击菜单可打开链接，不超过1024字节<br>
	 * view类型必须
	 * @return 网页链接
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 网页链接，用户点击菜单可打开链接，不超过1024字节<br>
	 * view类型必须
	 * @param url 网页链接
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 调用新增永久素材接口返回的合法media_id<br>
	 * media_id类型和view_limited类型必须
	 * @return 新增永久素材接口返回的合法media_id
	 */
	public String getMediaId() {
		return mediaId;
	}

	/**
	 * 调用新增永久素材接口返回的合法media_id<br>
	 * media_id类型和view_limited类型必须
	 * @param mediaId 新增永久素材接口返回的合法media_id
	 */
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * 二级菜单数组，个数应为1~5个
	 * @return 二级菜单数组
	 */
	public List<Button> getSubButton() {
		return subButton;
	}

	/**
	 * 二级菜单数组，个数应为1~5个
	 * @param subButton 二级菜单数组
	 */
	public void setSubButton(List<Button> subButton) {
		this.subButton = subButton;
	}
}
