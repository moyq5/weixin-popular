/**
 * 
 */
package weixin.popular.bean.menu.get;

import weixin.popular.bean.menu.create.Create;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 自定义菜单参数－非个性化菜单信息
 * @author Moyq5
 * @date 2016年9月14日
 */
public class Menu extends Create {

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
