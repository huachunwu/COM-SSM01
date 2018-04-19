package top.cms.service.impl;

import com.alibaba.druid.sql.visitor.functions.If;
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
                sysMenu.setHtml("<a href='"+sysAuth1.getAuthUrl()+"'><i class='"+sysAuth1.getAuthIcon()+"'></i>"+sysAuth1.getAuthName()+"</a>");
                sysMenu.setId(sysAuth1.getAuthId());
                sysMenus.add(sysMenu);
            }
        }
        for (SysMenu sysMenu:sysMenus){
            sysMenu.setChildren(getChild(sysMenu.getId(),sysAuths));
        }

        return sysMenus;
    }

    public List<SysMenu> getChild(String id,List<SysAuth> sysAuths){
        List<SysMenu> childList=new ArrayList<SysMenu>();
        for (SysAuth sysAuth:sysAuths){
            SysMenu sysMenu=null;
            if (!"0".equals(sysAuth.getAuthFId())){
                if (sysAuth.getAuthFId().equals(id)){
                    sysMenu=new SysMenu();
                    sysMenu.setHtml("<a href='"+sysAuth.getAuthUrl()+"'><i class='"+sysAuth.getAuthIcon()+"'></i>"+sysAuth.getAuthName()+"</a>");
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

}
