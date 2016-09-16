/**
 * 
 */
package weixin.popular.bean.menu.get;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 自定义菜单查询接口－响应参数
 * @author Moyq5
 * @date 2016年9月14日
 */
public class GetResult extends BaseResult {

	/**
	 * 默认菜单
	 */
	private Menu menu;	
	
	/**
	 * 个性化菜单列表
	 */
	@JsonProperty("conditionalmenu")
	private List<ConditionalMenu> conditionalMenu;

	/**
	 * @return 默认菜单
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * @param menu 默认菜单
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	/**
	 * @return 个性化菜单列表
	 */
	public List<ConditionalMenu> getConditionalMenu() {
		return conditionalMenu;
	}

	/**
	 * @param conditionalMenu 个性化菜单列表
	 */
	public void setConditionalMenu(List<ConditionalMenu> conditionalMenu) {
		this.conditionalMenu = conditionalMenu;
	}
}
