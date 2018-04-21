package top.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.cms.bean.PictureList;
import top.cms.bean.PictureManager;
import top.cms.dao.PictureListMapper;
import top.cms.service.PictureListService;
import top.cms.service.PictureManagerService;
import top.cms.utils.UUIDUtils;

import java.util.List;
import java.util.Map;

/**
 *  图片管理
 * @author yhmi
 */
@Controller
@RequestMapping(value = "pictureManager")
public class PictureManagerController {
    @Autowired
    private PictureManagerService pictureManagerService;

    @Autowired
    private PictureListService pictureListService;
    /**
     * 遍历列表
     * @param map
     * @return
     */
    @RequestMapping(value = "/listAll.cms")
    public String findPictureManager(Map<String,Object> map){
        List<PictureManager> pictureManager = pictureManagerService.findPictureManager();
        map.put("pictureManagerList",pictureManager);
        return "WEB-INF/jsp/admin/imageManager/imageManager";
    }

    @RequestMapping(value = "/addPictureManagerToView.cms")
    public String addPictureManagerToView(){
        return "WEB-INF/jsp/admin/imageManager/pictureAddView";
    }

    /**
     * 添加数据
     * @param pictureManager 获取数据 如果pstate等于1 制空表单项
     * @return 跳转网页
     */
    @RequestMapping(value = "/addPictureManager.cms")
    public String insertPictureManager(PictureManager pictureManager){
        System.out.println(pictureManager.getpState());
        String uuid = UUIDUtils.uuid();
        pictureManager.setpId(uuid);
        pictureManagerService.insertPictureManager(pictureManager);
        return "redirect:/pictureManager/editToView.cms?pId="+uuid;
    }
    @RequestMapping(value = "/editToView.cms")
    public String findPictureManagerByPid(String pId,Map<String,Object> map){
        System.out.println(pId);
        PictureManager pictureManagerByPid = pictureManagerService.findPictureManagerByPid(pId);
        List<PictureList> pictureByPid = pictureListService.findPictureByPid(pId);
        pictureManagerByPid.setPictureLists(pictureByPid);
        map.put("pictureManager",pictureManagerByPid);
        return "WEB-INF/jsp/admin/imageManager/pictureAddEdit";
    }
}
