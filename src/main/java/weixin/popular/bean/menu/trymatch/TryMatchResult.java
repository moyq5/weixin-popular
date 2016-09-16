package weixin.popular.bean.menu.trymatch;

import java.util.List;

import weixin.popular.bean.BaseResult;
import weixin.popular.bean.menu.create.Button;

/**
 * 测试个性化菜单匹配结果－响应参数
 * @author Moyq5
 * @date 2016年9月15日
 */
public class TryMatchResult extends BaseResult {

	/**
	 * 菜单按钮列表
	 */
	private List<Button> button;

	/**
	 * @return 菜单按钮列表
	 */
	public List<Button> getButton() {
		return button;
	}

	/**
	 * @param button 菜单按钮列表
	 */
	public void setButton(List<Button> button) {
		this.button = button;
	}
}
