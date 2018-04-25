package top.cms.service;

import top.cms.bean.TxBug;
import top.cms.utils.PageBean;

import java.util.List;

/**
 * 事务受理
 * @author yhmi
 */
public interface TxBugService {
    /**
     * 遍历列表
     * @param txBugPageBean
     * @return
     */
    public List<TxBug> findTxBugAll(PageBean<TxBug> txBugPageBean);
    /**
     * 查询总记录数
     * @return
     */
    public int findTxBugCount();
    /**
     * 根据条件查询遍历列表
     * @param txBug
     * @return
     */
    public List<TxBug> findTxBugByPams(TxBug txBug);

    /**
     * 根据id查询
     * @param txId
     * @return
     */
    TxBug findTxBugByTxId(String txId);
    /**
     * 通过id修改
     * @param txBug
     */
    void  editTxBugByTxId(TxBug txBug);
}
