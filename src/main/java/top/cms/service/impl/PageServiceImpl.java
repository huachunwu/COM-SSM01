package top.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cms.bean.TxBug;
import top.cms.bean.Wirter;
import top.cms.dao.*;
import top.cms.service.PageService;
import top.cms.service.SysUserService;
import top.cms.service.TxBugService;
import top.cms.utils.PageBean;

import java.util.List;

/**
 * 分页业务
 * @author yhmi
 */
@Service
public class PageServiceImpl implements PageService {
    @Autowired
    private TxBugService txBugService;
    @Autowired
    private SysUserMapper SysUserMapper;
    @Override
    public PageBean<TxBug> findTxBugAllPage(PageBean<TxBug> txBugPageBean) {
        /**
         * 设置总记录数
         */
        txBugPageBean.setTotalCount(txBugService.findTxBugCount());
        /**
         * 判断是否非空
         */
        if(txBugPageBean.getCurrentPage()==0){
            txBugPageBean.setCurrentPage(1);
        }else {
            txBugPageBean.setCurrentPage(txBugPageBean.getCurrentPage());
        }
        /**
         * 判断一页显示数量
         */
        if (txBugPageBean.getPageSize()==0){
            txBugPageBean.setPageSize(5);
        }else {
            txBugPageBean.setPageSize(txBugPageBean.getPageSize());
        }
        /**
         * 总页数
         */
        if (txBugPageBean.getTotalCount()%txBugPageBean.getPageSize()==0){
            txBugPageBean.setTotalPage(txBugPageBean.getTotalCount()/txBugPageBean.getPageSize());
        }else {
            txBugPageBean.setTotalPage((txBugPageBean.getTotalCount()/txBugPageBean.getPageSize())+1);
        }
        Integer startSize=(txBugPageBean.getCurrentPage()-1)*txBugPageBean.getPageSize();
        txBugPageBean.setStartSize(startSize);
        txBugPageBean.setList(txBugService.findTxBugAll(txBugPageBean));
        return txBugPageBean;
    }

    /**
     * 用户总条数
     * @return
     */
    @Override
    public int findSysUserCount() {
        return SysUserMapper.findSysUserCount();
    }

    @Autowired
    private PictureManagerMapper pictureManagerMapper;
    @Override
    public int pictureManagercount() {
        return pictureManagerMapper.pictureManagercount();
    }
    @Autowired
    private TxBugMapper txBugMapper;
    @Override
    public int findTxBugCount2() {
        return txBugMapper.findTxBugCount2();
    }
    @Autowired
    private WirterMapper wirterMapper;
    @Override
    public int findWirterCount() {
        return wirterMapper.findWirterCount();
    }

    @Override
    public List<Wirter> findWirterAllByRoleId() {
        List<Wirter> wirterAllByRoleId = wirterMapper.findWirterAllByRoleId();
        return wirterAllByRoleId;
    }

    @Override
    public List<TxBug> findTxBugNew() {
        return txBugMapper.findTxBugNew();
    }

    @Override
    public List<Wirter> findWirterAllNew() {
        return wirterMapper.findWirterAllNew();
    }
}
