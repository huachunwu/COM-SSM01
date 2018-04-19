package top.cms.service.impl;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.SysAuth;
import top.cms.bean.SysMenu;
import top.cms.bean.SysRole;
import top.cms.dao.SysRoleMapper;
import top.cms.service.SysRoleService;

import java.util.*;

/**
 * 角色表事务实现类
 * @author yhmi
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public List<SysMenu> listByRoleId(String roleId) {
        SysRole sysRole = sysRoleMapper.findSysRole(roleId);
        List<SysAuth> sysAuths = sysRole.getSysAuths();
        List<SysMenu> menuList=new ArrayList<SysMenu>();
        for (SysAuth sysAuth:sysAuths){
            if (StringUtils.isNotBlank(sysAuth.getAuthFId())){
                SysMenu sysMenu=new SysMenu();
                sysMenu.setId(sysAuth.getAuthId());
                sysMenu.setHtml("<a href='"+sysAuth.getAuthUrl()+"'><i class='"+sysAuth.getAuthIcon()+"'></i>"+sysAuth.getAuthName()+"</a>");
                menuList.add(sysMenu);
            }
        }
        for (SysMenu sysMenu:menuList){
            sysMenu.setChildren(getChaild(sysMenu.getId(),sysAuths));
        }
        return menuList;
    }

    /**
     * 递归查找子菜单
     * @param id 当前菜单id
     * @param sysAuths 查找的列表
     * @return
     */
    public List<SysMenu> getChaild(String id,List<SysAuth> sysAuths){
        List<SysMenu> childList=new ArrayList<SysMenu>();
        for (SysAuth sysAuth:sysAuths){
            if (StringUtils.isNotBlank(sysAuth.getAuthFId())){
                if (sysAuth.getAuthFId().equals(id)){
                    SysMenu sysMenu=new SysMenu();
                    sysMenu.setId(sysAuth.getAuthId());
                    sysMenu.setHtml("<a href='"+sysAuth.getAuthUrl()+"'><i class='"+sysAuth.getAuthIcon()+"'></i>"+sysAuth.getAuthName()+"</a>");
                    childList.add(sysMenu);
                }
            }
        }
        // 把子菜单的子菜单再循环一遍
        for (SysMenu sysMenu:childList){
                sysMenu.setChildren(getChaild(sysMenu.getId(),sysAuths));
        }
        if (childList.size()==0){
            return null;
        }
        return childList;
    }
}
