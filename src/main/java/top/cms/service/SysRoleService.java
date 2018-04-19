package top.cms.service;

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
}
