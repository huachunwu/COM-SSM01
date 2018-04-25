package top.cms.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import top.cms.bean.SysAuth;
import top.cms.bean.SysUser;
import top.cms.dao.SysUserMapper;
import top.cms.service.SysRoleService;
import top.cms.service.SysUserService;
import top.cms.utils.DateToString;

import java.util.Date;
import java.util.List;

/**
 * 认证授权登录
 * @author yhmi
 */
public class CMSRealm extends AuthorizingRealm {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    /**
     * 授权方法
     * @param principals
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //获取当前用户对象
        SysUser sysUser = (SysUser) principals.getPrimaryPrincipal();
        List<SysAuth> sysRoleAuth = sysRoleService.findSysRoleAuth(sysUser.getRoleId());
        for (SysAuth sysAuth:sysRoleAuth){
            info.addStringPermission(sysAuth.getAuthCode());
            /*TODO 日志系统*/
        }
        return info;
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
        /*TODO 权限日志 2018/4/20*/
        UsernamePasswordToken passwordToken=(UsernamePasswordToken)token;
        /**
         * 获得页面输入的用户名
         */
        String username=passwordToken.getUsername();
        SysUser sysUser = sysUserService.userLogin(username);
        AuthenticationInfo info=null;
        if (sysUser==null){
            /**
             * 用户名不存在
             */
            System.out.println("用户名不存在");
            return null;
        }else {
            sysUser.setLoginTime(DateToString.dateToString(new Date()));
            sysUserService.updateSysUserSetLoginTimeByUid(sysUser);
            info=new SimpleAuthenticationInfo(sysUser,sysUser.getPassword(),this.getName());
        }
        return info;

    }
}
