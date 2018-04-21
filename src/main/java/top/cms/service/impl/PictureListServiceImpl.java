package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.PictureList;
import top.cms.dao.PictureListMapper;
import top.cms.service.PictureListService;

import java.util.List;

/**
 * 图片列表
 * @author yhmi
 */
@Service
public class PictureListServiceImpl implements PictureListService {
    @Autowired
    private PictureListMapper pictureListMapper;
    @Override
    public List<PictureList> findPictureByPid(String pId) {
        return pictureListMapper.findPictureByPid(pId);
    }

    @Override
    public void insertPicture(PictureList pictureList) {
        pictureListMapper.insertPicture(pictureList);
    }

    @Override
    public PictureList findPictureByPLId(String pLId) {
        return pictureListMapper.findPictureByPLId(pLId);
    }

    @Override
    public void editPictureByPLId(PictureList pictureList) {
        pictureListMapper.editPictureByPLId(pictureList);
    }
}
