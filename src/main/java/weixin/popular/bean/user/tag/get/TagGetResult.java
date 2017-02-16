/**
 * 
 */
package weixin.popular.bean.user.tag.get;

import com.fasterxml.jackson.annotation.JsonProperty;

import weixin.popular.bean.BaseResult;

/**
 * 获取标签下粉丝列表－响应参数
 * @author Moyq5
 * @date 2017年2月16日
 */
public class TagGetResult extends BaseResult {

	/**
	 * 这次获取的粉丝数量
	 */
	private Integer count;
	
	/**
	 * 粉丝列表
	 */
	private TagGetResultData data;
	
	/**
	 * 拉取列表最后一个用户的openid
	 */
	@JsonProperty("next_openid")
	private String nextOpenId;

	/**
	 * @return 这次获取的粉丝数量t
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count 这次获取的粉丝数量
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * @return 粉丝列表
	 */
	public TagGetResultData getData() {
		return data;
	}

	/**
	 * @param data 粉丝列表
	 */
	public void setData(TagGetResultData data) {
		this.data = data;
	}

	/**
	 * @return 拉取列表最后一个用户的openid
	 */
	public String getNextOpenId() {
		return nextOpenId;
	}

	/**
	 * @param nextOpenId 拉取列表最后一个用户的openid
	 */
	public void setNextOpenId(String nextOpenId) {
		this.nextOpenId = nextOpenId;
	}
}
