/**
 * 
 */
package weixin.popular.bean.user.tag.get;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取标签下粉丝列表－响应参数－openId列表
 * @author Moyq5
 * @date 2017年2月16日
 */
public class TagGetResultData {

	/**
	 * openId列表
	 */
	@JsonProperty("openid")
	private List<String> openIds;

	/**
	 * @return openId列表
	 */
	public List<String> getOpenIds() {
		return openIds;
	}

	/**
	 * @param openIds openId列表
	 */
	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}
}
