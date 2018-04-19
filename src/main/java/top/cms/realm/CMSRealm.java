package top.cms.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import top.cms.bean.SysUser;
import top.cms.dao.SysUserMapper;
import top.cms.service.SysUserService;

public class CMSRealm extends AuthorizingRealm {
    @Autowired
    private SysUserService sysUserService;
    /**
     * 授权方法
     * @param principals
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 认证方法
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("自定义的realm中认证方法执行了。。。。。");
        UsernamePasswordToken passwordToken=(UsernamePasswordToken)token;
        /**
         * 获得页面输入的用户名
         */
        String username=passwordToken.getUsername();
        SysUser sysUser = sysUserService.userLogin(username);
        if (sysUser==null){
            /**
             * 用户名不存在
             */
            System.out.println("用户名不存在");
            return null;
        }
        AuthenticationInfo info=new SimpleAuthenticationInfo(sysUser,sysUser.getPassword(),this.getName());
        return info;
    }
}
