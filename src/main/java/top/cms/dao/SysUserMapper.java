package top.cms.dao;

import top.cms.bean.SysUser;

import java.util.List;

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

    /**
     * 查询所有
     * @return
     */
    List<SysUser> findSysUserAll();

    /**
     * 根据id查询
     * @param uId
     * @return
     */
    SysUser findSysUserByUid(String uId);

    /**
     * 根据id修改
     * @param sysUser
     */
    void updateSysUser(SysUser sysUser);

    /**
     * 根据id删除
     * @param uId
     */
    void delSysUserByUid(String uId);

    /**
     * 添加一条数据
     * @param sysUser
     */
    void addSysUser(SysUser sysUser);

    /**
     * 查询用户名存在
     * @param username
     * @return
     */
    SysUser findSysUserByUsernameA(String username);

    /**
     * 查询用户数量
     * @return
     */
    int findSysUserCount();
}
