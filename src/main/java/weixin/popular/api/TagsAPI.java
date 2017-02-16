package weixin.popular.api;

import java.nio.charset.Charset;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;

import weixin.popular.bean.BaseResult;
import weixin.popular.bean.tags.create.Create;
import weixin.popular.bean.tags.create.CreateResult;
import weixin.popular.bean.tags.delete.Delete;
import weixin.popular.bean.tags.get.GetResult;
import weixin.popular.bean.tags.getidlist.GetIdList;
import weixin.popular.bean.tags.getidlist.GetIdListResult;
import weixin.popular.bean.tags.members.batchtagging.MembersBatchTagging;
import weixin.popular.bean.tags.members.batchuntagging.MembersBatchUnTagging;
import weixin.popular.bean.tags.update.Update;
import weixin.popular.client.LocalHttpClient;
import weixin.popular.util.JsonUtil;

/**
 * 用户管理－标签管理
 * @author Moyq5
 * @date 2017年2月16日
 */
public class TagsAPI extends BaseAPI {

	/**
	 * 创建标签
	 */
	public static CreateResult create(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/tags/create")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				CreateResult.class);
	}

	/**
	 * 创建标签
	 */
	public static CreateResult create(String accessToken, Create create) {
		return create(accessToken, JsonUtil.toJson(create));
	}

	/**
	 * 获取公众号已创建的标签
	 */
	public static GetResult get(String accessToken) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/tags/get")
				.addParameter(getATPN(), accessToken)
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				GetResult.class);
	}

	/**
	 * 编辑标签
	 */
	public static BaseResult update(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/tags/update")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}

	/**
	 * 编辑标签
	 */
	public static BaseResult update(String accessToken, Update update) {
		return update(accessToken, JsonUtil.toJson(update));
	}

	/**
	 * 删除标签
	 */
	public static BaseResult delete(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/tags/delete")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}

	/**
	 * 删除标签
	 */
	public static BaseResult delete(String accessToken, Delete delete) {
		return delete(accessToken, JsonUtil.toJson(delete));
	}


	/**
	 * 批量为用户打标签
	 */
	public static BaseResult membersBatchTagging(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/tags/members/batchtagging")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}

	/**
	 * 批量为用户打标签
	 */
	public static BaseResult membersBatchTagging(String accessToken, MembersBatchTagging mbt) {
		return membersBatchTagging(accessToken, JsonUtil.toJson(mbt));
	}

	/**
	 * 批量为用户取消标签
	 */
	public static BaseResult membersBatchUnTagging(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/tags/members/batchuntagging")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}

	/**
	 * 批量为用户取消标签
	 */
	public static BaseResult membersBatchUnTagging(String accessToken, MembersBatchUnTagging mbut) {
		return membersBatchUnTagging(accessToken, JsonUtil.toJson(mbut));
	}


	/**
	 * 获取用户身上的标签列表
	 */
	public static GetIdListResult getIdList(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/tags/getidlist")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				GetIdListResult.class);
	}

	/**
	 * 获取用户身上的标签列表
	 */
	public static GetIdListResult getIdList(String accessToken, GetIdList getIdList) {
		return getIdList(accessToken, JsonUtil.toJson(getIdList));
	}

}
