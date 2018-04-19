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
}
