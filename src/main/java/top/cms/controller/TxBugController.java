package top.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.cms.bean.TxBug;
import top.cms.service.TxBugService;

import java.util.List;
import java.util.Map;

/**
 * 事务处理
 * @author yhmi
 */
@Controller
@RequestMapping(value = "txBug")
public class TxBugController {
    @Autowired
    private TxBugService txBugService;
    /**
     * 查询列表
     * @return
     */
    @RequestMapping(value = "/findAll.cms")
    public String findAll(Map<String,Object> map){
        List<TxBug> txBugs = txBugService.txBugAll();
        map.put("txBugs",txBugs);
        return "WEB-INF/jsp/admin/txBug/txBug";
    }
}
