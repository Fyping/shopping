package cn.com.fangself.loginauthorizing.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class LoginShiroRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Set<String> roleName = new HashSet<String>();
		Set<String> permissions = new HashSet<String>();
		
		roleName.add("administrater");
		permissions.add("newPage.html");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleName);
		info.setStringPermissions(permissions);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {

		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		if(token.getUsername().equals("fyping")){
			return new SimpleAuthenticationInfo("fyping","password"/*DecriptUtil.MD5("password")*/,getName());
		}else{
			throw new AuthenticationException();
		}
		
	}

}
