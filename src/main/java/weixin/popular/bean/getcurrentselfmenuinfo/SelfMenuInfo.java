package weixin.popular.bean.getcurrentselfmenuinfo;

import java.util.List;

/**
 * 获取自定义菜单配置接口－响应参数－菜单信息
 * 
 * @author Moyq5
 * @date 2016年9月16日
 */
public class SelfMenuInfo {

	/**
	 * 一级菜单按钮列表
	 */
	private List<Button> button;

	/**
	 * @return 一级菜单按钮列表
	 */
	public List<Button> getButton() {
		return button;
	}

	/**
	 * @param button 一级菜单按钮列表
	 */
	public void setButton(List<Button> button) {
		this.button = button;
	}

}
