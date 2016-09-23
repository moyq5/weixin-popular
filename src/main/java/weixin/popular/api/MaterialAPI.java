package weixin.popular.api;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;

import weixin.popular.bean.BaseResult;
import weixin.popular.bean.material.MaterialBatchgetResult;
import weixin.popular.bean.material.MaterialGetResult;
import weixin.popular.bean.material.MaterialcountResult;
import weixin.popular.bean.material.addmaterial.AddMaterialResult;
import weixin.popular.bean.material.addnews.AddNews;
import weixin.popular.bean.material.addnews.AddNewsResult;
import weixin.popular.bean.material.delmaterial.DelMaterial;
import weixin.popular.bean.material.updatenews.UpdateNews;
import weixin.popular.client.BytesOrJsonResponseHandler;
import weixin.popular.client.LocalHttpClient;
import weixin.popular.util.JsonUtil;

/**
 * 永久素材
 * 
 * @author LiYi
 *
 */
public class MaterialAPI extends BaseAPI {

	/**
	 * 上传（非视频）媒体素材
	 * 
	 * @author Moyq5
	 * @date 2016年9月9日
	 * @param accessToken 授权令牌
	 * @param type 媒体文件类型，分别有图片（image）、语音（voice）和缩略图（thumb）
	 * @param media 文件数据字节对象
	 * @param contentType 文件mineType类型
	 * @param filename 文件名
	 * @return
	 */
	public static AddMaterialResult addMaterial(String accessToken, String type, byte[] media, ContentType contentType, String filename) {
		return addMaterial(accessToken, type, (Object) media, contentType, filename, null, null);
	}

	/**
	 * 上传媒体素材
	 * 
	 * @author Moyq5
	 * @date 2016年9月9日
	 * @param accessToken 授权令牌
	 * @param type 媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
	 * @param media 文件数据字节对象
	 * @param contentType 文件mineType类型
	 * @param filename 文件名
	 * @param title 视频标题，type为video时必填
	 * @param introduction 视频说明，type为video时必填
	 * @return
	 */
	public static AddMaterialResult addMaterial(String accessToken, String type, byte[] media, ContentType contentType, String filename, String title, String introduction) {
		return addMaterial(accessToken, type, (Object) media, contentType, filename, title, introduction);
	}

	/**
	 * 上传（非视频）媒体素材
	 * 
	 * @author Moyq5
	 * @date 2016年9月9日
	 * @param accessToken 授权令牌
	 * @param type 媒体文件类型，分别有图片（image）、语音（voice）和缩略图（thumb）
	 * @param media 文件对象
	 * @return
	 */
	public static AddMaterialResult addMaterial(String accessToken, String type, File media) {
		return addMaterial(accessToken, type, (Object) media, null, null, null, null);
	}

	/**
	 * 上传媒体素材
	 * 
	 * @author Moyq5
	 * @date 2016年9月9日
	 * @param accessToken 授权令牌
	 * @param type 媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
	 * @param media 文件对象
	 * @param title 视频标题，type为video时必填
	 * @param introduction 视频说明，type为video时必填
	 * @return
	 */
	public static AddMaterialResult addMaterial(String accessToken, String type, File media, String title, String introduction) {
		return addMaterial(accessToken, type, (Object) media, null, null, title, introduction);
	}

	/**
	 * 上传（非视频）媒体素材
	 * 
	 * @author Moyq5
	 * @date 2016年9月9日
	 * @param accessToken 授权令牌
	 * @param type 媒体文件类型，分别有图片（image）、语音（voice）和缩略图（thumb）
	 * @param media 文件数据流对象
	 * @param contentType 文件mineType类型
	 * @param filename 文件名
	 * @return
	 */
	public static AddMaterialResult addMaterial(String accessToken, String type, InputStream media, ContentType contentType, String filename) {
		return addMaterial(accessToken, type, (Object) media, contentType, filename, null, null);
	}

	/**
	 * 上传媒体素材
	 * 
	 * @author Moyq5
	 * @date 2016年9月9日
	 * @param accessToken 授权令牌
	 * @param type 媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
	 * @param media 文件数据流对象
	 * @param contentType 文件mineType类型
	 * @param filename 文件名
	 * @param title 视频标题，type为video时必填
	 * @param introduction 视频说明，type为video时必填
	 * @return
	 */
	public static AddMaterialResult addMaterial(String accessToken,
			String type, InputStream media, ContentType contentType,
			String filename, String title, String introduction) {
		return addMaterial(accessToken, type, (Object) media, contentType,
				filename, title, introduction);
	}

	/**
	 * 上传媒体素材
	 * 
	 * @author Moyq5
	 * @date 2016年9月9日
	 * @param accessToken 授权令牌
	 * @param type 媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb）
	 * @param media 文件数据对象，可以是InputStream、byte[]、File
	 * @param contentType 文件mineType类型，media为InputStream、byte[]必填
	 * @param filename 文件名，media为InputStream、byte[]必填
	 * @param title 视频标题，type为video时必填
	 * @param introduction 视频说明，type为video时必填
	 * @return
	 */
	private static AddMaterialResult addMaterial(String accessToken, 
			String type, Object media, ContentType contentType, 
			String filename, String title, String introduction) {
		HttpPost httpPost = new HttpPost(BASE_URI
				+ "/cgi-bin/material/add_material");
		String descr = String.format(
				"{\"title\":\"%s\", \"introduction\":\"%s\"}", title,
				introduction);
		MultipartEntityBuilder meb = MultipartEntityBuilder.create();
		meb.addTextBody(getATPN(), accessToken);
		meb.addTextBody("type", type);
		meb.addTextBody("description", descr);
		if (media instanceof File) {
			File file = (File) media;
			FileBody contentBody = new FileBody(file);
			meb.addPart("media", contentBody);
		} else if (media instanceof InputStream) {
			InputStream stream = (InputStream) media;
			meb.addBinaryBody("media", stream, contentType, filename);
		} else if (media instanceof Byte[]) {
			byte[] bytes = (byte[]) media;
			meb.addBinaryBody("media", bytes, contentType, filename);
		}

		httpPost.setEntity(meb.build());
		return LocalHttpClient.executeJsonResult(httpPost,
				AddMaterialResult.class);
	}

	/**
	 * 新增永久图文素材
	 */
	public static AddNewsResult addNews(String accessToken, AddNews addNews) {
		return addNews(accessToken, JsonUtil.toJson(addNews));
	}

	/**
	 * 新增永久图文素材
	 */
	public static AddNewsResult addNews(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/material/add_news")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				AddNewsResult.class);
	}

	/**
	 * 获取永久素材
	 * 
	 * @param access_token
	 *            access_token
	 * @param media_id
	 *            media_id
	 * @return MaterialGetResult
	 */
	public static MaterialGetResult get_material(String access_token,
			String media_id) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/material/get_material")
				.addParameter(getATPN(), access_token)
				.setEntity(
						new StringEntity("{\"media_id\":\"" + media_id + "\"}",
								Charset.forName("utf-8"))).build();
		return LocalHttpClient.execute(httpUriRequest,
				BytesOrJsonResponseHandler
						.createResponseHandler(MaterialGetResult.class));
	}
	
	/**
	 * 删除永久素材
	 */
	public static BaseResult delMaterial(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/material/del_material")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}
	
	/**
	 * 删除永久素材
	 */
	public static BaseResult delMaterial(String accessToken, DelMaterial media) {
		return delMaterial(accessToken, "{\"media_id\":\"" + media.getMediaId() + "\"}");
	}

	/**
	 * 删除永久素材
	 */
	public static BaseResult delMaterialByMediaId(String accessToken, String mediaId) {
		return delMaterial(accessToken, "{\"media_id\":\"" + mediaId + "\"}");
	}
	
	/**
	 * 修改永久图文素材
	 */
	public static BaseResult updateNews(String accessToken, String postJson) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/material/update_news")
				.addParameter(getATPN(), accessToken)
				.setEntity(new StringEntity(postJson, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				BaseResult.class);
	}
	
	/**
	 * 修改永久图文素材
	 */
	public static BaseResult updateNews(String accessToken, UpdateNews updateNews) {
		return updateNews(accessToken, JsonUtil.toJson(updateNews));
	}

	/**
	 * 获取素材总数
	 * 
	 * @param access_token
	 *            access_token
	 * @return MaterialcountResult
	 */
	public static MaterialcountResult get_materialcount(String access_token) {
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setUri(BASE_URI + "/cgi-bin/material/get_materialcount")
				.addParameter(getATPN(), access_token).build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				MaterialcountResult.class);
	}

	/**
	 * 获取素材列表
	 * 
	 * @param access_token
	 *            access_token
	 * @param type
	 *            素材的类型，图片（image）、视频（video）、语音 （voice）、图文（news）
	 * @param offset
	 *            从全部素材的该偏移位置开始返回，0表示从第一个素材 返回
	 * @param count
	 *            返回素材的数量，取值在1到20之间
	 * @return MaterialBatchgetResult
	 */
	public static MaterialBatchgetResult batchget_material(String access_token,
			String type, int offset, int count) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/material/batchget_material")
				.addParameter(getATPN(), access_token)
				.setEntity(
						new StringEntity("{\"type\":\"" + type
								+ "\",\"offset\":" + offset + ",\"count\":"
								+ count + "}", Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,
				MaterialBatchgetResult.class);
	}

}
