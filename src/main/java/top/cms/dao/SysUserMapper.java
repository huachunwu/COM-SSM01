package top.cms.dao;

import top.cms.bean.SysUser;

/**
 * @author yhmi
 * 用户操作dao接口
 */
public interface SysUserMapper {
    /**
     * 用户登录
     * @param sysUser
     * @return
     */
    SysUser findSysUserByUsernameAndPassword(SysUser sysUser);

    /**
     * 用户授权
     * @param username
     * @return
     */
    SysUser findSysUserByUsername(String username);

    /**
     * 用户登录修改
     * @param sysUser
     */
    void updateSysUserSetLoginTimeByUid(SysUser sysUser);

    /**
     * 用户退出修改
     * @param sysUser
     */
    void updateSysUserSetLastTimeByUid(SysUser sysUser);
}
