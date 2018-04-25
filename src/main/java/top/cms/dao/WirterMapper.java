package top.cms.dao;

import top.cms.bean.Wirter;

import java.util.List;

/**
 * 文章
 * @author yhmi
 */
public interface WirterMapper {
    /**
     * 查询所有
     * @return
     */
    List<Wirter> findWirterAll();

    /**
     * 根据Id查询
     * @param wId
     * @return
     */
    Wirter findWirterById(String wId);

    /**
     * 根据id修改
     * @param wirter
     */
    void updateWirterById(Wirter wirter);

    /**
     * 发布文章
     * @param wirter
     */
    void addWirter(Wirter wirter);

    /**
     * 根据id删除
     * @param wId
     */
    void delWirter(String wId);

    /**
     * 统计数量
     * @return
     */
    int findWirterCount();

    /**
     * 根据roleid
     * @return
     */
    List<Wirter> findWirterAllByRoleId();

    /**
     * 最新文章
     * @return
     */
    List<Wirter> findWirterAllNew();
}
