/**
 * 
 */
package weixin.popular.bean.tags.get;

import weixin.popular.bean.tags.create.Tag;

/**
 * 获取公众号已创建的标签－响应参数－标签信息
 * @author Moyq5
 * @date 2017年2月16日
 */
public class GetResultTag extends Tag {

	/**
	 * 此标签下粉丝数
	 */
	private Integer count;

	/**
	 * @return 粉丝数
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count 粉丝数
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
}
