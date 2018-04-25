package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.TxBug;
import top.cms.dao.TxBugMapper;
import top.cms.service.TxBugService;
import top.cms.utils.PageBean;

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
    public List<TxBug> findTxBugAll(PageBean<TxBug> txBugPageBean) {
        return txBugMapper.findTxBugAll(txBugPageBean);
    }

    @Override
    public int findTxBugCount() {
        return txBugMapper.findTxBugCount();
    }
    @Override
    public List<TxBug> findTxBugByPams(TxBug txBug) {
        return txBugMapper.findTxBugByPams(txBug);
    }

    @Override
    public TxBug findTxBugByTxId(String txId) {
        return txBugMapper.findTxBugByTxId(txId);
    }

    @Override
    public void editTxBugByTxId(TxBug txBug) {
        txBugMapper.editTxBugByTxId(txBug);
    }

}
