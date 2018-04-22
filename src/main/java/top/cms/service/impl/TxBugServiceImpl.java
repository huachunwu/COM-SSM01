package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.TxBug;
import top.cms.dao.TxBugMapper;
import top.cms.service.TxBugService;

import java.util.List;

/**
 * 事务受理
 * @author yhmi
 */
@Service
public class TxBugServiceImpl implements TxBugService {
    @Autowired
    private TxBugMapper txBugMapper;
    @Override
    public List<TxBug> txBugAll() {
        return txBugMapper.txBugAll();
    }
}
