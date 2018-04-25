package top.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.cms.bean.TxBug;
import top.cms.bean.Wirter;
import top.cms.service.PageService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author yhmi
 * 用户页面信息
 */
@Controller
@RequestMapping(value = "Page")
public class SysPage {
    @Autowired
    private PageService pageService;
    @RequestMapping(value = "/cout.cms")
    private String count(Map<String,Object> map){
        int sysUserCount = pageService.findSysUserCount();
        int pictureManagercount = pageService.pictureManagercount();
        int txBugCount = pageService.findTxBugCount2();
        int wirterCount = pageService.findWirterCount();
        List<Wirter> wirterAllByRoleId = pageService.findWirterAllByRoleId();
        List<TxBug> txBugNew = pageService.findTxBugNew();
        List<Wirter> wirterAllNew = pageService.findWirterAllNew();
        map.put("sysUserCount",sysUserCount);
        map.put("pictureManagercount",pictureManagercount);
        map.put("txBugCount",txBugCount);
        map.put("wirterCount",wirterCount);
        map.put("wirterAllByRoleId",wirterAllByRoleId);
        map.put("txBugNew",txBugNew);
        map.put("wirterAllNew",wirterAllNew);
        return "WEB-INF/jsp/admin/dashborard/admin_dashborard";
    }
}
