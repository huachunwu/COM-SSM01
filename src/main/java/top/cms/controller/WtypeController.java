package top.cms.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cms.bean.Wtype;
import top.cms.service.WtypeService;
import top.cms.utils.UUIDUtils;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * @author yhmi
 */
@Controller
@RequestMapping(value = "wtype")
public class WtypeController {
    @Autowired
    private WtypeService wtypeService;

    /**
     * 查询所有json
     * @return
     */
    @RequestMapping(value = "/findWtypeAll.cms",produces = "text/html;charset=UTF-8")
    public @ResponseBody String findWtypeAll() throws UnsupportedEncodingException {
        Gson gson=new Gson();
        String s = gson.toJson(wtypeService.findWtypeAll());;
        System.out.println(s);
        return s;
    }
    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/findWtypeAllObject.cms")
    public  String findWtypeAllObject(Map<String,Object> map)  {
        List<Wtype> wtypeAll = wtypeService.findWtypeAll();
        map.put("wtypeAll",wtypeAll);
        return "WEB-INF/jsp/admin/wirterType/wirterTypeManager";
    }

    /**
     * 根据id查询
     * @param wTypeId
     * @param map
     * @return
     */
    @RequestMapping(value = "/findWtypeBywtypeId.cms")
    public String findWtypeBywtypeId(String wTypeId,Map<String,Object> map){
        Wtype wtypeBywtypeId = wtypeService.findWtypeBywtypeId(wTypeId);
        map.put("wtypeBywtypeId",wtypeBywtypeId);
        return "WEB-INF/jsp/admin/wirterType/wirterTypeEditToView";
    }

    /**
     * 通过id修改
     * @param wtype
     * @return
     */
    @RequestMapping(value = "/editWTypebyId.cms")
    public String editWTypebyId(Wtype wtype){
        wtypeService.editWTypebyId(wtype);
        return "redirect:/wtype/findWtypeAllObject.cms";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping(value = "/addWtypeView.cms")
    public String addWtypeView(){
        return "WEB-INF/jsp/admin/wirterType/wirterTypeAddToView";
    }
    @RequestMapping(value = "/addWtype.cms")
    public String addWtype(Wtype wtype){
        wtype.setwTypeId(UUIDUtils.uuid());
        wtypeService.addWtype(wtype);
        return "redirect:/wtype/findWtypeAllObject.cms";
    }

    /**
     * 根据用户id删除
     * @param wTypeId
     * @return
     */
    @RequestMapping(value = "/delWtypeById.cms")
    public String delWtypeById(String wTypeId){
        wtypeService.delWtypeById(wTypeId);
        return "redirect:/wtype/findWtypeAllObject.cms";
    }
}
