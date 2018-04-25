package top.cms.job;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import top.cms.bean.SysUser;
import top.cms.controller.CheckImageController;
import top.cms.service.SysUserService;
import top.cms.utils.DateToString;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Date;
import java.util.Enumeration;


/**
 * 定时任务
 * @author yhmi
 */
public class MyJob {
    private Logger logger= Logger.getLogger(MyJob.class);
    @Autowired
    private SysUserService sysUserService;
    public void sayHello(){
        Date start=new Date();
        logger.info(DateToString.dateToString(start)+"自动事务开始执行");
        Subject subject = SecurityUtils.getSubject();
        SysUser sysUser = (SysUser) subject.getPrincipal();
        sysUser.setLastTime(sysUser.getLoginTime());
        sysUserService.updateSysUserSetLastTimeByUid(sysUser);
        Date end=new Date();
        long l=end.getTime()-start.getTime();
        logger.info(DateToString.dateToString(end)+"自动事务结束执行，"+"用时："+l+"ms");
    }
}
