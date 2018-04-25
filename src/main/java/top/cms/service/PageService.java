package top.cms.service;

import top.cms.bean.TxBug;
import top.cms.bean.Wirter;
import top.cms.utils.PageBean;

import java.util.List;

/**
 *
 * @author yhmi
 * 分页业务
 */
public interface PageService {
    /**
     * txBug分页
     * @param txBugPageBean
     * @return
     */
    public PageBean<TxBug> findTxBugAllPage(PageBean<TxBug> txBugPageBean);
    /**
     * 查询用户数量
     * @return
     */
    int findSysUserCount();

    /**
     * 统计总条数
     * @return
     */
    int pictureManagercount();

    /**
     * 统计bug数量
     * @return
     */
    int findTxBugCount2();

    /**
     * 统计文章数量
     * @return
     */
    int findWirterCount();

    /**
     * 查询最新公告
     * @return
     */
    List<Wirter> findWirterAllByRoleId();

    /**
     * 查询最新事务
     * @return
     */
    List<TxBug> findTxBugNew();

    /**
     * 最新文章
     * @return
     */
    List<Wirter> findWirterAllNew();
}
