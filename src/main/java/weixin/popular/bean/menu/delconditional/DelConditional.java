package weixin.popular.bean.menu.delconditional;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 删除个性化菜单－请求参数
 * @author Moyq5
 * @date 2016年9月15日
 */
public class DelConditional {

	/**
	 * 菜单ID
	 */
	@JsonProperty("menuid")
	private Long menuId;

	/**
	 * @return 菜单ID
	 */
	public Long getMenuId() {
		return menuId;
	}

	/**
	 * @param menuId 菜单ID
	 */
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
}
