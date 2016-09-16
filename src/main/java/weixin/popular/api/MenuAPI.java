package weixin.popular.api;

import java.nio.charset.Charset;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;

import weixin.popular.bean.BaseResult;
import weixin.popular.bean.getcurrentselfmenuinfo.GetCurrentSelfMenuInfoResult;
import weixin.popular.bean.menu.addconditional.AddConditional;
import weixin.popular.bean.menu.addconditional.AddConditionalResult;
import weixin.popular.bean.menu.create.Create;
import weixin.popular.bean.menu.delconditional.DelConditional;
import weixin.popular.bean.menu.get.GetResult;
import weixin.popular.bean.menu.trymatch.TryMatch;
import weixin.popular.bean.menu.trymatch.TryMatchResult;
import weixin.popular.client.LocalHttpClient;
import weixin.popular.util.JsonUtil;

/**
 * 菜单API
 * 
 * @author LiYi
 *
 */
public class MenuAPI extends BaseAPI {

	/**
	 * 创建菜单
	 */
	public static BaseResult create(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/menu/create")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}

	/**
	 * 创建菜单
	 */
	public static BaseResult create(String accessToken, Create create) {
		return create(accessToken, JsonUtil.toJson(create));
	}

	/**
	 * 获取菜单
	 */
	public static GetResult get(String accessToken) {
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setUri(BASE_URI + "/cgi-bin/menu/get")
				.addParameter(getATPN(), accessToken).build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				GetResult.class);
	}

	/**
	 * 删除菜单
	 */
	public static BaseResult delete(String accessToken) {
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setUri(BASE_URI + "/cgi-bin/menu/delete")
				.addParameter(getATPN(), accessToken).build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}

	/**
	 * 获取自定义菜单配置 <br>
	 * 本接口将会提供公众号当前使用的自定义菜单的配置，<br>
	 * 如果公众号是通过API调用设置的菜单，则返回菜单的开发配置，<br>
	 * 而如果公众号是在公众平台官网通过网站功能发布菜单， 则本接口返回运营者设置的菜单配置。
	 */
	public static GetCurrentSelfMenuInfoResult getCurrentSelfMenuInfo(
			String accessToken) {
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setUri(BASE_URI + "/cgi-bin/get_current_selfmenu_info")
				.addParameter(getATPN(), accessToken).build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				GetCurrentSelfMenuInfoResult.class);
	}

	/**
	 * 创建个性化菜单
	 */
	public static AddConditionalResult addConditional(String accessToken,
			AddConditional addConditional) {
		return addConditional(accessToken, JsonUtil.toJson(addConditional));
	}

	/**
	 * 创建个性化菜单
	 */
	public static AddConditionalResult addConditional(String accessToken,
			String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/menu/addconditional")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				AddConditionalResult.class);
	}

	/**
	 * 删除个性化菜单
	 */
	public static BaseResult delConditional(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/menu/delconditional")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}

	/**
	 * 删除个性化菜单
	 */
	public static BaseResult delConditional(String accessToken, Long menuId) {
		return delConditional(accessToken, "{\"menuid\":\"" + menuId + "\"}");
	}

	/**
	 * 删除个性化菜单
	 */
	public static BaseResult delConditional(String accessToken,
			DelConditional delConditional) {
		return delConditional(accessToken, delConditional.getMenuId());
	}

	/**
	 * 测试个性化菜单匹配结果
	 */
	public static TryMatchResult tryMatch(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/menu/trymatch")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				TryMatchResult.class);
	}

	/**
	 * 测试个性化菜单匹配结果
	 */
	public static TryMatchResult tryMatchByUserId(String accessToken,
			String userId) {
		return tryMatch(accessToken, "{\"user_id\":\"" + userId + "\"}");
	}

	/**
	 * 测试个性化菜单匹配结果
	 */
	public static TryMatchResult tryMatchByUserId(String accessToken,
			TryMatch tryMatch) {
		return tryMatchByUserId(accessToken, tryMatch.getUserId());
	}

}