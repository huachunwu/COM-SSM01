package top.cms.service;

import top.cms.bean.TxBug;

import java.util.List;

/**
 * 事务受理
 * @author yhmi
 */
public interface TxBugService {
    /**
     * 遍历列表
     * @return
     */
    public List<TxBug> txBugAll();
}
