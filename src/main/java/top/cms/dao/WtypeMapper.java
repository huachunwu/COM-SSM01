package top.cms.dao;

import top.cms.bean.Wtype;

import java.util.List;

/**
 * 文章类型
 * @author yhmi
 */
public interface WtypeMapper {
    /**
     * 遍历所有
     * @return
     */
    List<Wtype> findWtypeAll();

    /**
     * 通过Id查找
     * @param wTypeId
     * @return
     */
    Wtype findWtypeBywtypeId(String wTypeId);

    /**
     * 通过Id修改
     * @param wtype
     */
    void editWtypebyId(Wtype wtype);

    /**
     * 添加数据
     * @param wtype
     */
    void addWtype(Wtype wtype);

    /**
     * 根据id删除
     * @param wTypeId
     */
    void delWtypeById(String wTypeId);
}
