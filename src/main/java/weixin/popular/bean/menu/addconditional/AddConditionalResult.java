package weixin.popular.bean.menu.addconditional;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 创建个性化菜单－响应参数
 * @author Moyq5
 * @date 2016年9月14日
 */
public class AddConditionalResult extends BaseResult {

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
