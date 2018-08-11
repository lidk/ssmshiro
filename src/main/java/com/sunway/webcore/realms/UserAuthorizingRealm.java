package com.sunway.webcore.realms;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunway.webcore.entity.CorePermission;
import com.sunway.webcore.entity.CoreUser;
import com.sunway.webcore.service.ICorePermissionService;
import com.sunway.webcore.service.ICoreUserInfoService;



/**
 * 用户的认证与授权
 *
 * @author lidk
 * @since 2017/2/26.
 */
public class UserAuthorizingRealm extends AuthorizingRealm {
	
	// 设置realm的名称
		@Override
		public void setName(String name) {
			super.setName("customRealm");
		}


	@Resource(name="coreUserInfoService")
	private ICoreUserInfoService coreUserInfoService;
	
	@Resource(name="corePermissionService")
	private ICorePermissionService corePermissionService;
	/**
	 * 对用户进行角色授权
	 *
	 * @param principalCollection
	 *            用户信息
	 * @return 返回用户授权信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		// 创建存放用户角色的 Set
		List<String> roles = new ArrayList<String>();

		// 获取用户角色
//		Subject currentSubject = SecurityUtils.getSubject();

		CoreUser user = (CoreUser) principalCollection.getPrimaryPrincipal();
		System.out.println("++++++++++=="+user);
		List<CorePermission> per = corePermissionService.getPermissionsByUserid(user.getId());
		
		for (CorePermission corePermission : per) {
			System.out.println("-------------"+corePermission.getPercode());
			roles.add(corePermission.getPercode());
		}
//		roles.add("User:query");
		
		SimpleAuthorizationInfo si = new SimpleAuthorizationInfo();
		si.addStringPermissions(roles);
		return si;
	}

	/**
	 * 对用户进行认证
	 *
	 * @param authenticationToken
	 *            用户凭证
	 * @return 返回用户的认证信息
	 * @throws AuthenticationException
	 *             用户认证异常信息
	 */
	// 用于认证
		@Override
		protected AuthenticationInfo doGetAuthenticationInfo(
				AuthenticationToken token) throws AuthenticationException {

	
			// 从token中取出身份信息
			String userCode = (String) token.getPrincipal();

			// 根据用户输入的userCode从数据库查询
			// ....
			System.out.println(userCode);
			CoreUser user = new CoreUser();
			user.setUsername(userCode);
			CoreUser result = coreUserInfoService.getCoreUserByUsername(user);
			System.out.println(result);
			
			
			
			// 如果查询不到返回null
			//数据库中用户账号是zhangsansan
			
			
			// \数据库查询到密码
			String password = result.getPassword();

			// 如果查询到返回认证信息AuthenticationInfo

			SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
					result, password, this.getName());

			return simpleAuthenticationInfo;
		}
		
		//清除缓存
		public void clearCached() {
			PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
			super.clearCache(principals);
		}

}
