package weixin.popular.test;

import org.junit.Test;

import weixin.popular.api.TokenAPI;
import weixin.popular.bean.token.Token;

public class TokenTest {

	protected static String accessToken = "DNWJ5Lf6NsohwKXqWiw9j6p6rh-0kjnD7dVrJ_LxeEOWQZ4g0n9O4T-HpYvZS5JLso44pmFUbxbUaCTslihbJgIanDUlzSx7nzv0HQf7JlEQNNaAFAVSS";
	
	@Test
	public void token() {
		Token token = TokenAPI.token("wxb67653b0d21d5e5a", "ccb5236f56ecc8769cc84ac1c4b429df");
		accessToken = token.getAccess_token();
		System.out.println(token.getAccess_token());
		// 请复制粘贴access_token 替换accessToken变量的值，方便其它接口测试类使用
	}
}
