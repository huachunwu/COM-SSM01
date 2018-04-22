package top.cms.service;

import top.cms.bean.PictureManager;
import top.cms.dao.PictureManagerMapper;

import java.util.List;

/**
 * 图片管理
 * @author yhmi
 */
public interface PictureManagerService {
    /**
     * 查询图片列表
     * @return
     */
    public List<PictureManager> findPictureManager();

    /**
     * 根据name拿到一个列表信息
     * @param pictureManager
     * @return
     */
    public PictureManager findPictureManagerByPName(PictureManager pictureManager);
    /**
     * 增加一条数据
     * @param pictureManager 传输的数据
     */
    public void insertPictureManager(PictureManager pictureManager);

    /**
     * 根据Id查询
     * @param pId
     * @return
     */
    public PictureManager findPictureManagerByPid(String pId);
    /**
     * 根据Id修改数据
     * @param pictureManager
     */
    void editPictureManager(PictureManager pictureManager);

    /**
     * 根据id删除类列表
     * @param pId
     */
    void deletePictureManagerByPId(String pId);
}
