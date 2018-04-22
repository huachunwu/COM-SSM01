package top.cms.dao;

import top.cms.bean.PictureList;

import java.util.List;

/**
 * 图片列表
 * @author yhmi
 */
public interface PictureListMapper {
    /**
     * 根据id查询列表
     * @param pId 列表Id
     * @return 返回List集合
     */
    List<PictureList> findPictureByPid(String pId);

    /**
     * 插入一条数据
     * @param pictureList
     */
    void insertPicture(PictureList pictureList);

    /**
     * 通过plId查询PictureList对象
     * @param pLId
     * @return
     */
    PictureList findPictureByPLId(String pLId);

    /**
     * 桶盖PLid修改PictureList对象
     * @param pictureList
     */
    void editPictureByPLId(PictureList pictureList);

    /**
     * 根据pLId删除列表项
     * @param pLId
     */
    void deletePictureListByPLId(String pLId);

    /**
     * 根据PId删除
     * @param pId
     */
    void deletePictureListByPId(String pId);
}
