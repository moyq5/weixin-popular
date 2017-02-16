/**
 * 
 */
package weixin.popular.bean.tags.create;

import weixin.popular.bean.BaseResult;

/**
 * 创建标签－响应参数
 * @author Moyq5
 * @date 2017年2月16日
 */
public class CreateResult extends BaseResult {

	/**
	 * 标签信息
	 */
	private Tag tag;

	/**
	 * @return 标签信息
	 */
	public Tag getTag() {
		return tag;
	}

	/**
	 * @param tag 标签信息
	 */
	public void setTag(Tag tag) {
		this.tag = tag;
	}

}
