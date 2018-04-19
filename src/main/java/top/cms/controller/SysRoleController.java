package top.cms.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cms.bean.SysMenu;
import top.cms.bean.SysUser;
import top.cms.service.SysRoleService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author yhmi 角色操作
 */
@Controller
@RequestMapping("sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;
    @RequestMapping(value = "/listByRoleId.cms",produces = "application/json; charset=utf-8")
    public  @ResponseBody String listByRoleId(HttpSession session){
        SysUser sysUser = (SysUser) session.getAttribute("SysUser");
        String roleId = sysUser.getRoleId();
        System.out.println(roleId);
        List<SysMenu> sysMenus = sysRoleService.listByRoleId(sysUser.getRoleId());
        String s = JSON.toJSONString(sysMenus);
        System.out.println(s);
        return s;
    }
}
