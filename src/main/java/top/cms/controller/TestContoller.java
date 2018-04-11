package top.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yhmi
 * 测试
 */
@RequestMapping("test")
@Controller
public class TestContoller {
    @RequestMapping("index")
    public  String testIndex(){
        return "testIndex";
    }
}
