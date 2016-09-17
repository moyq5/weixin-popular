package weixin.popular.bean.message.mass.sendall;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 用于设定图文消息的接收者
 * @author Moyq5
 * @date 2016年9月17日
 */
public class Filter {

	/**
	 * 用于设定是否向全部用户发送，值为true或false，选择true该消息群发给所有用户，选择false可根据tag_id发送给指定群组的用户
	 */
	@JsonProperty("is_to_all")
	private Boolean isToAll;
	
	/**
	 * 群发到的标签的tag_id，参加用户管理中用户分组接口，若is_to_all值为true，可不填写tag_id
	 */
	@JsonProperty("tag_id")
	private String tagId;

	/**
	 * 用于设定是否向全部用户发送，值为true或false，选择true该消息群发给所有用户，选择false可根据tag_id发送给指定群组的用户
	 * @return 是否向全部用户发送
	 */
	public Boolean getIsToAll() {
		return isToAll;
	}

	/**
	 * 用于设定是否向全部用户发送，值为true或false，选择true该消息群发给所有用户，选择false可根据tag_id发送给指定群组的用户
	 * @param isToAll 是否向全部用户发送
	 */
	public void setIsToAll(Boolean isToAll) {
		this.isToAll = isToAll;
	}

	/**
	 * 群发到的标签的tag_id，参加用户管理中用户分组接口，若is_to_all值为true，可不填写tag_id
	 * @return 群发到的标签的tag_id
	 */
	public String getTagId() {
		return tagId;
	}

	/**
	 * 群发到的标签的tag_id，参加用户管理中用户分组接口，若is_to_all值为true，可不填写tag_id
	 * @param tagId 群发到的标签的tag_id
	 */
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
}
