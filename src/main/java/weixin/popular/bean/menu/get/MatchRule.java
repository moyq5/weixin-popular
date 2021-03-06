/**
 * 
 */
package weixin.popular.bean.menu.get;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 自定义菜单参数－非个性化菜单信息－菜单匹配规则。<br>
 * matchrule共六个字段，均可为空，但不能全部为空，至少要有一个匹配信息是不为空的。 <br>
 * country、province、city组成地区信息，将按照country、province、city的顺序进行验证，要符合地区信息表的内容。地区信息从大到小验证，小的可以不填，即若填写了省份信息，则国家信息也必填并且匹配，城市信息可以不填。 例如 “中国 广东省 广州市”、“中国 广东省”都是合法的地域信息，而“中国 广州市”则不合法，因为填写了城市信息但没有填写省份信息。 地区信息表请点击下载
 * @author Moyq5
 * @date 2016年9月14日
 */
public class MatchRule {

	/**
	 * 用户标签的id，可通过用户标签管理接口获取
	 */
	@JsonProperty("tag_id")
	private String tagId;
	
	/**
	 * 性别：男（1）女（2），不填则不做匹配
	 */
	private String sex;
	
	/**
	 * 国家信息，是用户在微信中设置的地区，具体请参考地区信息表
	 */
	private String country;
	
	/**
	 * 省份信息，是用户在微信中设置的地区，具体请参考地区信息表
	 */
	private String province;
	
	/**
	 * 城市信息，是用户在微信中设置的地区，具体请参考地区信息表
	 */
	private String city;
	
	/**
	 * 客户端版本，当前只具体到系统型号：IOS(1), Android(2),Others(3)，不填则不做匹配
	 */
	@JsonProperty("client_platform_type")
	private String clientPlatformType;
	
	/**
	 * 语言信息，是用户在微信中设置的语言，具体请参考语言表：
	 * 1、简体中文 "zh_CN" 2、繁体中文TW "zh_TW" 3、繁体中文HK "zh_HK" 4、英文 "en" 5、印尼 "id" 
	 * 6、马来 "ms" 7、西班牙 "es" 8、韩国 "ko" 9、意大利 "it" 10、日本 "ja" 
	 * 11、波兰 "pl" 12、葡萄牙 "pt" 13、俄国 "ru" 14、泰文 "th" 15、越南 "vi" 
	 * 16、阿拉伯语 "ar" 17、北印度 "hi" 18、希伯来 "he" 19、土耳其 "tr" 20、德语 "de" 21、法语 "fr"
	 */
	private String language;

	/**
	 * 用户标签的id，可通过用户标签管理接口获取
	 * @return 用户标签的id
	 */
	public String getTagId() {
		return tagId;
	}

	/**
	 * 用户标签的id，可通过用户标签管理接口获取
	 * @param tagId 用户标签的id
	 */
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	/**
	 * 性别：男（1）女（2），不填则不做匹配
	 * @return 性别
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 性别：男（1）女（2），不填则不做匹配
	 * @param sex 性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 国家信息，是用户在微信中设置的地区，具体请参考地区信息表
	 * @return 国家信息
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 国家信息，是用户在微信中设置的地区，具体请参考地区信息表
	 * @param country 国家信息
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 省份信息，是用户在微信中设置的地区，具体请参考地区信息表
	 * @return 省份信息
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 省份信息，是用户在微信中设置的地区，具体请参考地区信息表
	 * @param province 省份信息
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 城市信息，是用户在微信中设置的地区，具体请参考地区信息表
	 * @return 城市信息
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 城市信息，是用户在微信中设置的地区，具体请参考地区信息表
	 * @param city 城市信息
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 客户端版本，当前只具体到系统型号：IOS(1), Android(2),Others(3)，不填则不做匹配
	 * @return 客户端版本
	 */
	public String getClientPlatformType() {
		return clientPlatformType;
	}

	/**
	 * 客户端版本，当前只具体到系统型号：IOS(1), Android(2),Others(3)，不填则不做匹配
	 * @param clientPlatformType 客户端版本
	 */
	public void setClientPlatformType(String clientPlatformType) {
		this.clientPlatformType = clientPlatformType;
	}

	/**
	 * 语言信息，是用户在微信中设置的语言，具体请参考语言表：
	 * 1、简体中文 "zh_CN" 2、繁体中文TW "zh_TW" 3、繁体中文HK "zh_HK" 4、英文 "en" 5、印尼 "id" 
	 * 6、马来 "ms" 7、西班牙 "es" 8、韩国 "ko" 9、意大利 "it" 10、日本 "ja" 
	 * 11、波兰 "pl" 12、葡萄牙 "pt" 13、俄国 "ru" 14、泰文 "th" 15、越南 "vi" 
	 * 16、阿拉伯语 "ar" 17、北印度 "hi" 18、希伯来 "he" 19、土耳其 "tr" 20、德语 "de" 21、法语 "fr"
	 * @return 语言信息
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * 语言信息，是用户在微信中设置的语言，具体请参考语言表：
	 * 1、简体中文 "zh_CN" 2、繁体中文TW "zh_TW" 3、繁体中文HK "zh_HK" 4、英文 "en" 5、印尼 "id" 
	 * 6、马来 "ms" 7、西班牙 "es" 8、韩国 "ko" 9、意大利 "it" 10、日本 "ja" 
	 * 11、波兰 "pl" 12、葡萄牙 "pt" 13、俄国 "ru" 14、泰文 "th" 15、越南 "vi" 
	 * 16、阿拉伯语 "ar" 17、北印度 "hi" 18、希伯来 "he" 19、土耳其 "tr" 20、德语 "de" 21、法语 "fr"
	 * @param language 语言信息
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
}
