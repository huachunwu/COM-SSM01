package top.cms.dao;

import top.cms.bean.TxBug;
import top.cms.utils.PageBean;

import java.util.List;

/**
 * 事务管理
 * @author yhmi
 */
public interface TxBugMapper {
    /**
     * 遍历列表
     * @param txBugPageBean
     * @return
     */
    List<TxBug> findTxBugAll(PageBean<TxBug> txBugPageBean);

    /**
     * 查询总记录数
     * @return
     */
    int findTxBugCount();
    /**
     * 根据条件查询遍历列表
     * @param txBug
     * @return
     */
    List<TxBug> findTxBugByPams(TxBug txBug);

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

    /**
     * 统计
     * @return
     */
    int findTxBugCount2();

    /**
     * 查询最新
     * @return
     */
    List<TxBug> findTxBugNew();
}
