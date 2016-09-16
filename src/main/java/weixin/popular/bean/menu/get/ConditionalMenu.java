/**
 * 
 */
package weixin.popular.bean.menu.get;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 自定义菜单查询接口－响应参数－非个性化菜单信息
 * @author Moyq5
 * @date 2016年9月14日
 */
public class ConditionalMenu extends Menu {

	/**
	 * 菜单匹配规则
	 */
	@JsonProperty("matchrule")
	private MatchRule matchRule;

	/**
	 * @return 菜单匹配规则
	 */
	public MatchRule getMatchRule() {
		return matchRule;
	}

	/**
	 * @param matchRule 菜单匹配规则
	 */
	public void setMatchRule(MatchRule matchRule) {
		this.matchRule = matchRule;
	}
}
