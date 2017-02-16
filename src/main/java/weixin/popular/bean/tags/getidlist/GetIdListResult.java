/**
 * 
 */
package weixin.popular.bean.tags.getidlist;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 获取用户身上的标签列表－响应参数
 * @author Moyq5
 * @date 2017年2月16日
 */
public class GetIdListResult extends BaseResult {

	/**
	 * 被置上的标签id列表
	 */
	@JsonProperty("tagid_list")
	private List<Integer> tagIds;

	/**
	 * @return 被置上的标签id列表
	 */
	public List<Integer> getTagIds() {
		return tagIds;
	}

	/**
	 * @param tagIds 被置上的标签id列表
	 */
	public void setTagIds(List<Integer> tagIds) {
		this.tagIds = tagIds;
	}
}
