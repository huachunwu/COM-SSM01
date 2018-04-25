package top.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.cms.bean.TxBug;
import top.cms.service.PageService;
import top.cms.service.TxBugService;
import top.cms.utils.PageBean;

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

    @Autowired
    private PageService pageService;
    /**
     * 查询列表
     * @return
     */
    @RequestMapping(value = "/findAll.cms")
    public String findAll(Map<String,Object> map, PageBean<TxBug> txBugPageBean){
        PageBean<TxBug> txBugAllPage = pageService.findTxBugAllPage(txBugPageBean);
        map.put("txBugAllPage",txBugAllPage);
        return "WEB-INF/jsp/admin/txBug/txBug";
    }

    /**
     * 根据条件查询
     * @param txBug
     * @return
     */
    @RequestMapping(value = "/findByPams.cms")
    public String findByPams(TxBug txBug,Map<String,Object> map){
        List<TxBug> txBugByPams = txBugService.findTxBugByPams(txBug);
        map.put("txBugByPams",txBugByPams);
        return "WEB-INF/jsp/admin/txBug/txBugPams";
    }

    /**
     * 跳转到修改页面
     * @param txId
     * @param map
     * @return
     */
    @RequestMapping(value = "/editTOView.cms")
    public String editTOView(String txId,Map<String,Object> map){
        TxBug txBugByTxId = txBugService.findTxBugByTxId(txId);
        map.put("txBugByTxId",txBugByTxId);
        return "WEB-INF/jsp/admin/txBug/txBugEditToView";
    }

    @RequestMapping(value = "/editById.cms")
    public String editById(TxBug txBug){
        System.out.println(txBug);
        txBugService.editTxBugByTxId(txBug);
        return "redirect:/txBug/findAll.cms";
    }
}
