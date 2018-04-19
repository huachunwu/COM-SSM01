package top.cms.dao;


import top.cms.bean.SysRole;

import java.util.List;

/**
 * 权限查询role
 */
public interface SysRoleMapper {
    SysRole findSysRole(String roleId);
}
