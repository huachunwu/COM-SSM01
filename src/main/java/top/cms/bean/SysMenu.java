package top.cms.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author yhmi
 * 菜单封装
 */
public class SysMenu implements Serializable {
    /**
     * id
     */
    private String id;
    /**
     * 页面内容
     */
    private String html;
    /**
     * 父子节点
     */
    private List<SysMenu> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public List<SysMenu> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
                "id='" + id + '\'' +
                ", html='" + html + '\'' +
                ", children=" + children +
                '}';
    }
}
