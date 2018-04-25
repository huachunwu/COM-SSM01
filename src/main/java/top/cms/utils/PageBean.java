package top.cms.utils;
import java.util.List;

/**
 * @author yhmi
 * 分页工具类
 */
public class PageBean<T> {
    /**
     * 当前页
     */
    private int currentPage;

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 每页显示条数
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 起始大小
     */
    private int startSize;
    /**
     * 分页数据
     */
    private List<T> list;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getStartSize() {
        return startSize;
    }

    public void setStartSize(int startSize) {
        this.startSize = startSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
