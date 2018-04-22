package top.cms.dao;

import top.cms.bean.TxBug;

import java.util.List;

/**
 * 事务管理
 * @author yhmi
 */
public interface TxBugMapper {
    /**
     * 遍历列表
     * @return
     */
    List<TxBug> txBugAll();
}
