package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.Wirter;
import top.cms.dao.WirterMapper;
import top.cms.service.WirterService;

import java.util.List;

/**
 * 文章
 * @author yhmi
 */
@Service
public class WirterServiceImpl implements WirterService {
    @Autowired
    private WirterMapper wirterMapper;
    @Override
    public List<Wirter> findWirterAll() {
        return wirterMapper.findWirterAll();
    }

    @Override
    public Wirter findWirterById(String wId) {
        return wirterMapper.findWirterById(wId);
    }

    @Override
    public void updateWirterById(Wirter wirter) {
        wirterMapper.updateWirterById(wirter);
    }

    @Override
    public void addWirter(Wirter wirter) {
        wirterMapper.addWirter(wirter);
    }

    @Override
    public void delWirter(String wId) {
        wirterMapper.delWirter(wId);
    }
}
