package top.cms.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
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
import top.cms.utils.DateToString;
import top.cms.utils.UUIDUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用户操作Controller
 *
 * @author yhmi
 */
@Controller
@RequestMapping(value = "sysUser")
public class SysUserController {
    Logger logger= Logger.getLogger(SysUserController.class);
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

    /**
     * 遍历用户列表
     * @param map
     * @return
     */
    @RequestMapping(value = "/findAll.cms")
    public String findSysUserAll(Map<String,Object> map){
        List<SysUser> sysUserAll = sysUserService.findSysUserAll();
        map.put("sysUserAll",sysUserAll);
        return "WEB-INF/jsp/admin/SysUsers/SysUserManager";
    }

    /**
     * 跳转到修改页面
     * @param uId
     * @param map
     * @return
     */
    @RequestMapping(value = "/findSysUserByUid.cms")
    public String findSysUserByUid(String uId,Map<String,Object> map){
        SysUser sysUserByUid = sysUserService.findSysUserByUid(uId);
        map.put("sysUserByUid",sysUserByUid);
        return "WEB-INF/jsp/admin/SysUsers/SysUserToView";
    }

    /**
     * 修改用户信息
     * @param sysUser
     * @return
     */
    @RequestMapping(value = "/updateSysUser.cms")
    public String updateSysUser(SysUser sysUser){
        System.out.println(sysUser);
        sysUserService.updateSysUser(sysUser);
        return "redirect:/sysUser/findAll.cms";
    }

    /**
     * 根据id删除用户
     * @param uId
     * @return
     */
    @RequestMapping(value = "/delSysUserByUid.cms")
    public String delSysUserByUid(String uId){
        sysUserService.delSysUserByUid(uId);
        return "redirect:/sysUser/findAll.cms";
    }

    /**
     * 跳到添加页面
     * @return
     */
    @RequestMapping(value = "/toAdd.cms")
    public String toAdd(){
        return "WEB-INF/jsp/admin/SysUsers/SysUserAdd";
    }

    @RequestMapping(value = "/addSysUser.cms")
    public String addSysUser(SysUser sysUser){
        sysUser.setUid(UUIDUtils.uuid());
        sysUser.setCreateTime(DateToString.dateToString(new Date()));
        sysUserService.addSysUser(sysUser);
        return "redirect:/sysUser/findAll.cms";
    }
}
