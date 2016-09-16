package weixin.popular.support.msg.handle;

import weixin.popular.support.msg.beans.receive.*;

/**
 * 各类推送信息处理接口
 * 
 * @author Moyq5
 *
 */
public interface Replyer {

	/**
	 * 微信认证事件推送-年审通知消息处理
	 */
	public String annualRenew(String appId, MsgEAnnualRenew msg);
	
	/**
	 * 卡券－审核（不通过）事件消息处理
	 */
	public String cardNotPassCheck(String appId, MsgECardNotPassCheck msg);
	
	/**
	 * 卡券－审核（通过）事件消息处理
	 */
	public String cardPassCheck(String appId, MsgECardPassCheck msg);
	
	/**
	 * 卡券－券点流水详情事件消息处理<br>
	 * 当商户朋友的券券点发生变动时，微信服务器会推送消息给商户服务器。
	 */
	public String cardPayOrder(String appId, MsgECardPayOrder msg);
	
	/**
	 * 卡券－库存报警事件消息处理
	 */
	public String cardSkuRemind(String appId, MsgECardSkuRemind msg);
	
	/**
	 * 卡券－会员卡激活事件消息处理
	 */
	public String submitMemberCardUserInfo(String appId, MsgESubmitMemberCardUserInfo msg);
	
	/**
	 * 自定义菜单点击事件处理
	 */
	public String click(String appId, MsgEClick msg);

	public String location(String appId, MsgELocation msg);

	public String locationSelect(String appId, MsgELocationSelect msg);

	/**
	 * 事件推送群发结果通知
	 */
	public String massSendJobFinish(String appId, MsgEMassSendJobFinish msg);

	public String namingVerifyFail(String appId, MsgENamingVerifyFail msg);

	public String namingVerifySuccess(String appId, MsgENamingVerifySuccess msg);

	public String picPhotoOrAlbum(String appId, MsgEPicPhotoOrAlbum msg);

	public String picSysPhoto(String appId, MsgEPicSysphoto msg);

	public String picWeixin(String appId, MsgEPicWeixin msg);

	/**
	 * 微信门店审核消息处理
	 */
	public String poiCheckNotify(String appId, MsgEPoiCheckNotify msg);

	public String qualificationVerifyFail(String appId, MsgEQualificationVerifyFail msg);

	public String qualificationVerifySuccess(String appId, MsgEQualificationVerifySuccess msg);

	/**
	 * 消息管理－用户扫描关注（原本已经是关注状态）
	 */
	public String scan(String appId, MsgEScan msg);

	public String scanCodePush(String appId, MsgEScancodePush msg);

	public String scanCodeWaitMsg(String appId, MsgEScancodeWaitmsg msg);

	/**
	 * 消息管理－用户关注
	 */
	public String subscribe(String appId, MsgESubscribe msg);

	/**
	 * 模板消息发送结果通知
	 */
	public String templateSendJobFinish(String appId, MsgETemplateSendJobFinish msg);

	/**
	 * 消息管理－取消关注
	 */
	public String unsubscribe(String appId, MsgEUnSubscribe msg);
	
	/**
	 * 卡券－会员卡内容更新事件消息处理
	 */
	public String updateMemberCard(String appId, MsgEUpdateMemberCard msg);
	
	/**
	 * 卡券－核销事件推送消息
	 */
	public String userConsumeCard(String appId, MsgEUserConsumeCard msg);
	
	/**
	 * 卡券－删除事件消息处理
	 */
	public String userDelCard(String appId, MsgEUserDelCard msg);
	
	/**
	 * 卡券－从卡券进入公众号会话事件消息处理
	 */
	public String userEnterSessionFromCard(String appId, MsgEUserEnterSessionFromCard msg);
	
	/**
	 * 卡券－领取事件消息处理
	 */
	public String userGetCard(String appId, MsgEUserGetCard msg);
	
	/**
	 * 卡券－进入会员卡事件消息处理
	 */
	public String userViewCard(String appId, MsgEUserViewCard msg);
	
	/**
	 * 卡券－买单事件消息处理
	 */
	public String userPayFromPayCell(String appId, MsgEUserPayFromPayCell msg);

	public String verifyExpired(String appId, MsgEVerifyExpired msg);

	public String view(String appId, MsgEView msg);

	public String image(String appId, MsgImage msg);

	public String link(String appId, MsgLink msg);

	public String location(String appId, MsgLocation msg);

	public String shortVideo(String appId, MsgShortVideo msg);

	public String text(String appId, MsgText msg);

	public String video(String appId, MsgVideo msg);

	public String voice(String appId, MsgVoice msg);
	
	/**
	 * 摇一摇周边－红包绑定用户事件通知处理
	 */
	public String shakeAroundLotteryBind(String appId, MsgEShakeAroundLotteryBind msg);
	
	/**
	 * 微信摇一摇周边－摇一摇事件通知处理
	 */
	public String shakeAroundUserShake(String appId, MsgEShakeAroundUserShake msg);

}
