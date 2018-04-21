package top.cms.bean;

import java.io.Serializable;

/**
 * 图片列表
 * @author yhmi
 */
public class PictureList implements Serializable {
    /**
     * 图片列表id
     */
    private String pLId;
    /**
     * 图片URL地址
     */
    private String pLUrl;
    /**
     * 图片描述
     */
    private String depict;
    /**
     * 图片列表Id
     */
    private  String pId;
    public String getpLId() {
        return pLId;
    }

    public void setpLId(String pLId) {
        this.pLId = pLId;
    }

    public String getpLUrl() {
        return pLUrl;
    }

    public void setpLUrl(String pLUrl) {
        this.pLUrl = pLUrl;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    @Override
    public String toString() {
        return "PictureList{" +
                "pLId='" + pLId + '\'' +
                ", pLUrl='" + pLUrl + '\'' +
                ", depict='" + depict + '\'' +
                ", pid='" + pId + '\'' +
                '}';
    }
}
