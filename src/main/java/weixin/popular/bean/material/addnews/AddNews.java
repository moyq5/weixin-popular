package weixin.popular.bean.material.addnews;

import java.util.List;

/**
 * 新增永久图文素材－请求参数
 * @author Moyq5
 * @date 2016年9月11日
 */
public class AddNews {

	/**
	 * 文章列表
	 */
	private List<Article> articles;

	/**
	 * @return 文章列表
	 */
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles 文章列表
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
