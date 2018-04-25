package top.cms.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cms.bean.SysUser;
import top.cms.bean.Wirter;
import top.cms.service.WirterService;
import top.cms.utils.UUIDUtils;

import java.util.List;
import java.util.Map;

/**
 * 文章
 * @author yhmi
 */
@Controller
@RequestMapping(value = "wirter")
public class WirterController {
    @Autowired
    private WirterService wirterService;
    /**
     * 查询所有
     * @param map
     * @return
     */
    @RequestMapping(value = "/findWirterAll.cms")
    public String findWirterAll(Map<String,Object> map){
        List<Wirter> wirterAll = wirterService.findWirterAll();
        map.put("wirterAll",wirterAll);
        return "WEB-INF/jsp/admin/wirter/wirterManager";
    }

    /**
     * 跳转到修改视图
     * @param wId
     * @param map
     * @return
     */
    @RequestMapping(value = "/findWirterById.cms")
    public String findWirterById(String wId,Map<String,Object> map){
        Wirter wirterById = wirterService.findWirterById(wId);
        map.put("wirterById",wirterById);
        return "WEB-INF/jsp/admin/wirter/wirterEditToView";
    }

    /**
     * 页面修改
     * @param wirter
     * @return
     */
    @RequestMapping(value = "/updateWirterById.cms")
    public String updateWirterById(Wirter wirter){
        System.out.println(wirter);
        wirterService.updateWirterById(wirter);
        return "redirect:/wirter/findWirterAll.cms";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping(value = "/WirterToAddView.cms")
    public String WirterToAddView(){
        return "WEB-INF/jsp/admin/wirter/wirterToAdd";
    }

    /**
     * 添加文章
     * @return
     */
    @RequestMapping(value = "/addWirter.cms")
    public String  addWirter(Wirter wirter){
        Subject subject = SecurityUtils.getSubject();
        SysUser sysUser = (SysUser) subject.getPrincipal();
        wirter.setwId(UUIDUtils.uuid());
        wirter.setuId(sysUser.getUid());
        wirterService.addWirter(wirter);
        return "redirect:/wirter/findWirterAll.cms";
    }

    /**
     * 根据Id删除
     * @param wId
     * @return
     */
    @RequestMapping(value = "/delWirter.cms")
    public String delWirter(String wId){
        wirterService.delWirter(wId);
        return  "redirect:/wirter/findWirterAll.cms";
    }
}
