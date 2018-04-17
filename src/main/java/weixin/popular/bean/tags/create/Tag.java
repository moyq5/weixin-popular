/**
 * 
 */
package weixin.popular.bean.tags.create;

/**
 * 创建标签－请求参数－标签信息
 * @author Moyq5
 * @date 2017年2月16日
 */
public class Tag {

	/**
	 * 标签id，<br>
	 * 添加时，由微信分配，不必填写；编辑时，必填；删除时，必填。
	 */
	private Integer id;
	
	/**
	 * 标签名称，<br>
	 * 添加时，必填；编辑时，必填。
	 */
	private String name;
	
	/**
	 * 标签id，<br>
	 * 添加时，由微信分配。
	 * @return 标签id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 标签id，<br>
	 * 添加时，由微信分配，不必填写；编辑时，必填；删除时，必填。
	 * @param id 标签id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return 标签名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 标签名（30个字符以内），<br>
	 * 添加时，必填；编辑时，必填。
	 * @param name 标签名称
	 */
	public void setName(String name) {
		this.name = name;
	}
}
