package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.PictureManager;
import top.cms.dao.PictureManagerMapper;
import top.cms.service.PictureManagerService;

import java.util.List;

/**
 * 图片管理
 * @author yhmi
 */
@Service
public class PictureManagerServiceImpl implements PictureManagerService {
    @Autowired
    private PictureManagerMapper pictureManagerMapper;
    @Override
    public List<PictureManager> findPictureManager() {
        return pictureManagerMapper.findPictureManager();
    }

    @Override
    public PictureManager findPictureManagerByPName(PictureManager pictureManager) {
        return pictureManagerMapper.findPictureManagerByPName(pictureManager);
    }

    @Override
    public void insertPictureManager(PictureManager pictureManager) {
        PictureManager pictureManagerByUser = pictureManagerMapper.findPictureManagerByPName(pictureManager);
        String s="1";
      if (pictureManager.getpName()!=null&&!pictureManager.getpName().trim().equals("")){
          if (pictureManagerByUser==null){
              System.out.println(pictureManager.getpState());
              if (s.trim().equals(pictureManager.getpState().trim())){
                  pictureManagerMapper.updatePictureManagerAllPState();
                  pictureManagerMapper.insertPictureManager(pictureManager);
              }else {
                  pictureManagerMapper.insertPictureManager(pictureManager);
              }
          }else{
              System.out.println("用户已经存在");
          }
      }else{
          System.out.println("你输入的名称为空！！！");
      }
    }

    @Override
    public PictureManager findPictureManagerByPid(String pId) {
        return pictureManagerMapper.findPictureManagerByPid(pId);
    }
}
