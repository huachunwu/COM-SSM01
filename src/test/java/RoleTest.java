import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cms.bean.*;
import top.cms.dao.*;
import top.cms.service.SysRoleService;
import top.cms.utils.PageBean;

import javax.management.relation.Role;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void findTest2(){
        List<SysMenu> sysMenus = sysRoleService.listByRoleId("1");
        for (SysMenu sysMenu:sysMenus){
            System.out.println(sysMenu);
        }
        Gson gson=new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Map<String,Object> map=new HashMap<>();
        map.put("map",sysMenus);
        String s = gson.toJson(sysMenus);
        String $1$2 = s.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
        String s1 = $1$2.replaceAll("\"", "");
        System.out.println(s1);
    }

    @Autowired
    private PictureListMapper pictureListMapper;
    @Test
    public void test5(){
        PictureList pictureByPLId = pictureListMapper.findPictureByPLId("1");
        System.out.println(pictureByPLId);
    }

    @Autowired
    private TxBugMapper txBugMapper;
    @Test
    public void test6(){
        PageBean<TxBug> pageBean=new PageBean<TxBug>();
        pageBean.setStartSize(0);
        pageBean.setStartSize(2);

        List<TxBug> txBugAll = txBugMapper.findTxBugAll(pageBean);
        System.out.println(txBugAll);

    }
    @Test
    public void test7(){
        int txBugCount = txBugMapper.findTxBugCount();
        System.out.println(txBugCount);

    }
    @Autowired
    private WirterMapper wirterMapper;
    @Test
    public void test8(){
        List<Wirter> wirterAll = wirterMapper.findWirterAll();
        System.out.println(wirterAll);
    }

}
