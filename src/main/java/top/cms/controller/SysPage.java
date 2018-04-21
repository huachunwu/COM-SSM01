package top.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yhmi
 * 用户页面信息
 */
@Controller
@RequestMapping(value = "Page")
public class SysPage {
    @RequestMapping(value = "/cout.cms")
    private String count(HttpServletRequest request){
        return "WEB-INF/jsp/admin/dashborard/admin_dashborard";
    }
}
