package top.cms.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 图片管理
 * @author yhmi
 */
public class PictureManager implements Serializable {
    /**
     * 图片列表id
     */
    private String pId;
    /**
     * 图片列表描述
     */
    private String pName;
    /**
     * 列表应用状态
     */
    private String pState;
    private List<PictureList> pictureLists;
    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState;
    }

    public List<PictureList> getPictureLists() {
        return pictureLists;
    }

    public void setPictureLists(List<PictureList> pictureLists) {
        this.pictureLists = pictureLists;
    }

    @Override
    public String toString() {
        return "PictureManager{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", pState='" + pState + '\'' +
                ", pictureLists=" + pictureLists +
                '}';
    }
}
