/**
 * 
 */
package weixin.popular.bean.user.tag.get;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取标签下粉丝列表－请求参数
 * @author Moyq5
 * @date 2017年2月16日
 */
public class TagGet {

	/**
	 * 标签ID，必填
	 */
	@JsonProperty("tagid")
	private Integer tagId;
	
	/**
	 * 第一个拉取的OPENID，不填默认从头开始拉取
	 */
	@JsonProperty("next_openid")
	private String nextOpenId;

	/**
	 * @return 标签ID
	 */
	public Integer getTagId() {
		return tagId;
	}

	/**
	 * 标签ID，必填
	 * @param tagId 标签ID
	 */
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	/**
	 * @return 第一个拉取的OPENID
	 */
	public String getNextOpenId() {
		return nextOpenId;
	}

	/**
	 * 第一个拉取的OPENID，不填默认从头开始拉取
	 * @param nextOpenId 第一个拉取的OPENID
	 */
	public void setNextOpenId(String nextOpenId) {
		this.nextOpenId = nextOpenId;
	}
}
