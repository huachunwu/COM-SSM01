package top.cms.service;

import top.cms.bean.SysUser;

/**
 * @author yhmi
 * 用户操作Service接口
 */
public interface SysUserService {
    /**
     * 用户登录
     * @param username 表单传入的值
     * @return 返回查询结果
     */
    public SysUser userLogin(String username);

    /**
     * 用户登录修改
     * @param sysUser 传入参数
     */
    public  void updateSysUserSetLoginTimeByUid(SysUser sysUser);

    /**
     * 用户退出修改
     * @param sysUser
     */
    public void updateSysUserSetLastTimeByUid(SysUser sysUser);
}
