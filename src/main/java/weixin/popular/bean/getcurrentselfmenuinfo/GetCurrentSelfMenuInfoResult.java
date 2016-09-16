package weixin.popular.bean.getcurrentselfmenuinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 获取自定义菜单配置接口－响应参数
 * @author Moyq5
 * @date 2016年9月16日
 */
public class GetCurrentSelfMenuInfoResult extends BaseResult {

	/**
	 * 菜单是否开启，0代表未开启，1代表开启
	 */
	@JsonProperty("is_menu_open")
	private Integer isMenuOpen;

	/**
	 * 菜单信息
	 */
	@JsonProperty("selfmenu_info")
	private SelfMenuInfo selfMenuInfo;

	/**
	 * 菜单是否开启，0代表未开启，1代表开启
	 * @return 菜单是否开启
	 */
	public Integer getIsMenuOpen() {
		return isMenuOpen;
	}

	/**
	 * 菜单是否开启，0代表未开启，1代表开启
	 * @param isMenuOpen 菜单是否开启
	 */
	public void setIsMenuOpen(Integer isMenuOpen) {
		this.isMenuOpen = isMenuOpen;
	}

	/**
	 * @return 菜单信息
	 */
	public SelfMenuInfo getSelfMenuInfo() {
		return selfMenuInfo;
	}

	/**
	 * @param selfMenuInfo 菜单信息
	 */
	public void setSelfMenuInfo(SelfMenuInfo selfMenuInfo) {
		this.selfMenuInfo = selfMenuInfo;
	}

}
