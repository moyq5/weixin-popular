/**
 * 
 */
package weixin.popular.bean.message.mass.sendall;

import weixin.popular.bean.message.mass.ImageData;


/**
 * 根据标签进行群发－请求参数（图片消息）
 * @author Moyq5
 * @date 2016年9月17日
 */
public class MassSendAllImage extends ImageData {

	/**
	 * 用于设定图文消息的接收者<br>
	 * 必填
	 */
	private Filter filter;
	
	/**
	 * 用于设定图文消息的接收者<br>
	 * 必填
	 * @return 接收者
	 */
	public Filter getFilter() {
		return filter;
	}

	/**
	 * 用于设定图文消息的接收者<br>
	 * 必填
	 * @param filter 接收者
	 */
	public void setFilter(Filter filter) {
		this.filter = filter;
	}

}
