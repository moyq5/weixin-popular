/**
 * 
 */
package weixin.popular.bean.menu.addconditional;

import weixin.popular.bean.menu.create.Create;
import weixin.popular.bean.menu.get.MatchRule;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 创建个性化菜单－请求参数
 * @author Moyq5
 * @date 2016年9月14日
 */
public class AddConditional extends Create {

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
