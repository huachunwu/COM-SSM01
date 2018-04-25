package top.cms.service;

import top.cms.bean.Wirter;

import java.util.List;

/**
 * 文章
 * @author yhmi
 */
public interface WirterService {
    /**
     * 文章查询
     * @return
     */
    public List<Wirter> findWirterAll();

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
}
