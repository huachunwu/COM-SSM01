package top.cms.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.cms.bean.SysUser;
import top.cms.service.SysUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户操作Controller
 *
 * @author yhmi
 */
@Controller
@RequestMapping(value = "sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 用户登录
     *
     * @param session session获取验证码
     * @param piccode 从前端登录页面传入的用户输入的值
     * @param user    表单提交的数据
     * @param request 响应错误信息
     * @return 调转或者重定向的网页
     */
    @RequestMapping(value = "/login.cms")
    public String login(HttpSession session, HttpServletRequest request, String piccode, SysUser user) {
        /**
         * 首先校验验证码是否正确
         *
         */
        String piccode1 = (String) session.getAttribute("piccode");
        System.out.println(piccode);
        if (StringUtils.isNoneBlank(piccode.toLowerCase()) && piccode1.equals(piccode.trim().toLowerCase())) {
            /**
             * 使用shiro框架提供的方式进行认证操作
             */
            Subject subject = SecurityUtils.getSubject();
            /**
             * 创建用户名密码令牌对象
             */
            AuthenticationToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
            try {
                subject.login(token);
            } catch (Exception e) {
                e.printStackTrace();
                return "login";
            }
            SysUser sysUser = (SysUser) subject.getPrincipal();
            session.setAttribute("SysUser", sysUser);
            return "redirect:/admin_index.jsp";

        } else {
            request.setAttribute("msg", "验证码错误");
            return "login";
        }
    }

    /**
     * 用户退出
     *
     * @return 跳转地址
     */
    @RequestMapping(value = "/logOut.cms")
    public String logOut() {
        Subject subject = SecurityUtils.getSubject();
        SysUser sysUser = (SysUser) subject.getPrincipal();
        sysUser.setLastTime(sysUser.getLoginTime());
        sysUserService.updateSysUserSetLastTimeByUid(sysUser);
        subject.logout();
        return "redirect:/index.jsp";
    }
}
