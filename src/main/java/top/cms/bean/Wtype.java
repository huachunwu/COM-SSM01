package top.cms.bean;

/**
 * 文章类型
 * @author yhmi
 */
public class Wtype {
    /**
     * 文章类型id
     */
    private String wTypeId;
    /**
     * 文章类型名字
     */
    private String wTypeName;

    public String getwTypeId() {
        return wTypeId;
    }

    public void setwTypeId(String wTypeId) {
        this.wTypeId = wTypeId;
    }

    public String getwTypeName() {
        return wTypeName;
    }

    public void setwTypeName(String wTypeName) {
        this.wTypeName = wTypeName;
    }

    @Override
    public String toString() {
        return "Wtype{" +
                "wTypeId='" + wTypeId + '\'' +
                ", wTypeName='" + wTypeName + '\'' +
                '}';
    }
}
