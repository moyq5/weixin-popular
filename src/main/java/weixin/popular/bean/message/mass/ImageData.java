/**
 * 
 */
package weixin.popular.bean.message.mass;

import weixin.popular.bean.message.mass.Image;


/**
 * 群发－图片消息参数
 * @author Moyq5
 * @date 2016年9月17日
 */
public abstract class ImageData extends AbstractMassSend {

	public ImageData() {
		this.msgType = "image";
	}
	
	/**
	 * 要发送的图片信息<br>
	 * 必填
	 */
	private Image image;

	/**
	 * 要发送的图片信息<br>
	 * 必填
	 * @return 要发送的图片信息
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * 要发送的图片信息<br>
	 * 必填
	 * @param image 要发送的图片信息
	 */
	public void setImage(Image image) {
		this.image = image;
	}

}
