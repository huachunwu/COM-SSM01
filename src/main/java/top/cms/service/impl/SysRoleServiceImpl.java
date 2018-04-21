package top.cms.service.impl;
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
        /**
         * 原始数据
         */
        List<SysAuth> sysAuths = sysRole.getSysAuths();
        /**
         * 最后结果
         */
        List<SysMenu> sysMenus=new ArrayList<SysMenu>();
        for (SysAuth sysAuth:sysAuths){
            System.out.println(sysAuth);
        }
        for (SysAuth sysAuth1:sysAuths){
            SysMenu sysMenu=null;
            if ("0".equals(sysAuth1.getAuthFId())){
                sysMenu=new SysMenu();
                sysMenu.setHtml("<a href='#' fid='"+sysAuth1.getAuthId()+"' aurl='"+sysAuth1.getAuthUrl()+"'><i class='"+sysAuth1.getAuthIcon()+"'></i>"+sysAuth1.getAuthName()+"</a>");
                sysMenu.setId(sysAuth1.getAuthId());
                sysMenus.add(sysMenu);
            }
        }
        for (SysMenu sysMenu:sysMenus){
            sysMenu.setChildren(getChild(sysMenu.getId(),sysAuths));
        }

        return sysMenus;
    }

    /**
     * 递归子类
     * @param id 父的id
     * @param sysAuths 所有权限
     * @return 返回递归出的List集合
     */
    @Override
    public List<SysMenu> getChild(String id,List<SysAuth> sysAuths){
        List<SysMenu> childList=new ArrayList<SysMenu>();
        for (SysAuth sysAuth:sysAuths){
            SysMenu sysMenu=null;
            if (!"0".equals(sysAuth.getAuthFId())){
                if (sysAuth.getAuthFId().equals(id)){
                    sysMenu=new SysMenu();
                    sysMenu.setHtml("<a href='#' fid='"+sysAuth.getAuthId()+"' aurl='"+sysAuth.getAuthUrl()+"'><i class='"+sysAuth.getAuthIcon()+"'></i>"+sysAuth.getAuthName()+"</a>");
                    sysMenu.setId(sysAuth.getAuthId());
                    childList.add(sysMenu);
                }
            }
        }
        for (SysMenu sysMenu:childList){
            sysMenu.setChildren(getChild(sysMenu.getId(),sysAuths));
        }
        if (childList.size()==0){
            return null;
        }
        return childList;
    }

    /**
     * 遍历权限表
     * @param roleId 根据角色表id
     * @return
     */
    @Override
    public List<SysAuth> findSysRoleAuth(String roleId) {
        SysRole sysRole = sysRoleMapper.findSysRole(roleId);
        /**
         * 原始数据
         */
        List<SysAuth> sysAuths = sysRole.getSysAuths();
        return sysAuths;
    }


}
