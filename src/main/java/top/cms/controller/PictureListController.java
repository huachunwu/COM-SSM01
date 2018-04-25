package top.cms.controller;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import top.cms.bean.PictureList;
import top.cms.bean.SysUser;
import top.cms.service.PictureListService;
import top.cms.utils.UUIDUtils;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * 图片列表
 *
 * @author yhmi
 */
@Controller
@RequestMapping(value = "pictureList")
public class PictureListController {
    @Autowired
    private PictureListService pictureListService;

    /**
     * 跳转到添加页面
     *
     * @param pId
     * @param map
     * @return
     */
    @RequestMapping(value = "/pictureListToAddView.cms")
    public String toAddView(String pId, Map<String, String> map) {
        map.put("pId", pId);
        return "WEB-INF/jsp/admin/imageManager/pictureListAddView";
    }

    /**
     * 添加数据
     * @param file
     * @param pictureList
     * @param map
     * @param session
     * @return
     */
    @RequestMapping(value = "/pictureListAdd.cms")
    public String pictureListAdd(MultipartFile file, PictureList pictureList, Map<String, Object> map, HttpSession session) {
        if (!file.isEmpty()) {
            try {
                /**
                 * 获取文件名字
                 */
                String filename = file.getOriginalFilename();
                pictureList.setpLUrl(filename);
                String realPath = session.getServletContext().getRealPath("/upload");
                File file1 = new File(realPath, filename);
                file.transferTo(file1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件为空");
        }
        pictureList.setpLId(UUIDUtils.uuid());
        pictureListService.insertPicture(pictureList);
        return "redirect:/pictureManager/editToView.cms?pId=" + pictureList.getpId();
    }

    /**
     * 跳到修改页面
     * @param pLId
     * @param map
     * @return
     */
    @RequestMapping(value = "/findPictureByPLId.cms")
    public String findPictureByPLId(String pLId,Map<String,Object> map){
        System.out.println(pLId);
        PictureList pictureByPLId = pictureListService.findPictureByPLId(pLId);
        System.out.println(pictureByPLId);
        map.put("pictureList",pictureByPLId);
        return "WEB-INF/jsp/admin/imageManager/pictureListEditView";
    }

    /**
     * 文件修改和图片修改上传
     * @param file
     * @param pictureList
     * @param map
     * @param session
     * @return
     */
    @RequestMapping(value = "/editPictureByPLId.cms")
    public String editPictureByPLId(MultipartFile file, PictureList pictureList, Map<String, Object> map, HttpSession session){
        if (!file.isEmpty()){
            try {
                /**
                 * 获取文件名字
                 */
                String filename = file.getOriginalFilename();
                pictureList.setpLUrl(filename);
                String realPath = session.getServletContext().getRealPath("/upload");
                File file1 = new File(realPath, filename);
                file.transferTo(file1);
                pictureList.setpLUrl(filename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件为空");
        }
        pictureListService.editPictureByPLId(pictureList);
        return "redirect:/pictureManager/editToView.cms?pId="+pictureList.getpId();
    }
    @RequestMapping(value = "/deletePictureListByPLId.cms")
    public String deletePictureListByPLId(String pLId){
        if (!pLId.isEmpty()&&pLId!=null){
            pictureListService.deletePictureListByPLId(pLId);
        }
        return "redirect:/pictureManager/listAll.cms";
    }
}
