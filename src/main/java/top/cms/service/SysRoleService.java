package top.cms.service;

import top.cms.bean.SysAuth;
import top.cms.bean.SysMenu;

import java.util.List;

/**
 * 角色表事务
 * @author yhmi
 */
public interface SysRoleService {
    /**
     * Ajax转换生成列表
     * @param roleId
     * @return
     */
    public List<SysMenu> listByRoleId(String roleId);

    /**
     * 递归子类
     * @param id 父的id
     * @param sysAuths 所有权限
     * @return 返回递归出的List集合
     */
    public List<SysMenu> getChild(String id,List<SysAuth> sysAuths);

    /**
     * 查询权限表
     * @param roleId
     * @return
     */
    public List<SysAuth> findSysRoleAuth(String roleId);
}
