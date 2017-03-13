/**
 * 
 */
package weixin.popular.bean.tags.members.batchtagging;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 批量为用户打标签－请求参数
 * @author Moyq5
 * @date 2017年2月16日
 */
public class MembersBatchTagging {

	/**
	 * 粉丝openId列表
	 */
	@JsonProperty("openid_list")
	private List<String> openIds;
	
	/**
	 * 标签id
	 */
	@JsonProperty("tagid")
	private Integer tagId;

	/**
	 * @return 粉丝openId列表
	 */
	public List<String> getOpenIds() {
		return openIds;
	}

	/**
	 * @param openIds 粉丝openId列表
	 */
	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

	/**
	 * @return 标签id
	 */
	public Integer getTagId() {
		return tagId;
	}

	/**
	 * @param tagId 标签id
	 */
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
}
