package weixin.popular.bean.menu.create;

import java.util.List;

/**
 * 自定义菜单创建接口－请求参数
 * @author Moyq5
 * @date 2016年9月12日
 */
public class Create {

	/**
	 * 一级菜单数组，个数应为1~3个<br>
	 * 必填
	 */
	private List<Button> button;

	/**
	 * @return 一级菜单数组
	 */
	public List<Button> getButton() {
		return button;
	}

	/**
	 * @param button 一级菜单数组
	 */
	public void setButton(List<Button> button) {
		this.button = button;
	}
}
