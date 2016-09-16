/**
 * 
 */
package weixin.popular.bean.getcurrentselfmenuinfo;

import java.util.List;

/**
 * 获取自定义菜单配置接口－响应参数－菜单信息－一级菜单按钮信息－子级菜单按钮
 * @author Moyq5
 * @date 2016年9月16日
 */
public class SubButton {

	/**
	 * 子菜单按钮列表
	 */
	private List<Button> list;

	/**
	 * @return 子菜单按钮列表
	 */
	public List<Button> getList() {
		return list;
	}

	/**
	 * @param list 子菜单按钮列表
	 */
	public void setList(List<Button> list) {
		this.list = list;
	}

}
