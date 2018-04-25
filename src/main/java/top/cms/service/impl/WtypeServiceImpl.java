package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.Wtype;
import top.cms.dao.WtypeMapper;
import top.cms.service.WtypeService;

import java.util.List;

/**
 * 文章类型
 * @author yhmi
 */
@Service
public class WtypeServiceImpl implements WtypeService {
    @Autowired
    private WtypeMapper wtypeMapper;
    @Override
    public List<Wtype> findWtypeAll() {
        return wtypeMapper.findWtypeAll();
    }

    @Override
    public Wtype findWtypeBywtypeId(String wTypeId) {
        return wtypeMapper.findWtypeBywtypeId(wTypeId);
    }

    @Override
    public void editWTypebyId(Wtype wtype) {
        wtypeMapper.editWtypebyId(wtype);
    }

    @Override
    public void addWtype(Wtype wtype) {
        wtypeMapper.addWtype(wtype);
    }

    @Override
    public void delWtypeById(String wTypeId) {
        wtypeMapper.delWtypeById(wTypeId);
    }
}
