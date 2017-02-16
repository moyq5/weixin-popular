/**
 * 
 */
package weixin.popular.bean.tags.get;

import java.util.List;

import weixin.popular.bean.BaseResult;

/**
 * 获取公众号已创建的标签－响应参数
 * @author Moyq5
 * @date 2017年2月16日
 */
public class GetResult extends BaseResult {

	/**
	 * 标签列表信息
	 */
	private List<GetResultTag> tags;

	/**
	 * @return 标签列表信息
	 */
	public List<GetResultTag> getTags() {
		return tags;
	}

	/**
	 * @param tags 标签列表信息
	 */
	public void setTags(List<GetResultTag> tags) {
		this.tags = tags;
	}

}
