package weixin.popular.bean.getcurrentselfmenuinfo;

import java.util.List;

/**
 * 获取自定义菜单配置接口－响应参数－菜单信息－按钮信息－图文信息
 * 
 * @author Moyq5
 * @date 2016年9月16日
 */
public class NewsInfo {

	/**
	 * 图文列表
	 */
	private List<News> list;

	/**
	 * @return 图文列表
	 */
	public List<News> getList() {
		return list;
	}

	/**
	 * @param list
	 *            图文列表
	 */
	public void setList(List<News> list) {
		this.list = list;
	}

}
