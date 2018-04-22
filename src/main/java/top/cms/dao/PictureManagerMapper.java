package top.cms.dao;

import top.cms.bean.PictureManager;

import java.util.List;

/**
 * 图片管理
 * @author yhmi
 */
public interface PictureManagerMapper {
    /**
     * 查询图片列表
     * @return
     */
    List<PictureManager> findPictureManager();

    /**
     * 根据name拿到一个列表信息
     * @param pictureManager
     * @return
     */
    PictureManager findPictureManagerByPName(PictureManager pictureManager);

    /**
     * 增加一条数据
     * @param pictureManager 传输的数据
     */
    void insertPictureManager(PictureManager pictureManager);

    /**
     * 制空所有
     */
    void updatePictureManagerAllPState();

    /**
     * 根据id查询
     * @param pId
     * @return
     */
    PictureManager findPictureManagerByPid(String pId);

    /**
     * 根据Id修改数据
     * @param pictureManager
     */
    void editPictureManager(PictureManager pictureManager);

    /**
     * 根据PId删除
     * @param pId
     */
    void deletePictureManagerByPId(String pId);
}
