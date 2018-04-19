import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cms.bean.SysRole;
import top.cms.bean.SysUser;
import top.cms.dao.SysRoleMapper;
import top.cms.service.SysRoleService;

import javax.management.relation.Role;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 测试页面
 * @author yhmi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class RoleTest {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysRoleService sysRoleService;
    @Test
    public void findTest(){
        SysRole sysRole = sysRoleMapper.findSysRole("1");
        System.out.println(sysRole);
    }
    @Test
    public void findTest2(HttpSession session){
        SysUser sysUser = (SysUser) session.getAttribute("SysUser");
        String s = sysRoleService.listByRoleId(sysUser.getRoleId());
        System.out.println(s);
    }
}
