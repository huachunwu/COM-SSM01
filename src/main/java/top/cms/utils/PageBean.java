package top.cms.utils;
import java.util.List;

/**
 * @author yhmi
 * 分页工具类
 */
public class PageBean {
    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * 每页显示条数
     */
    private Integer pageSize;
    /**
     * 分页数据
     */
    private List list;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
