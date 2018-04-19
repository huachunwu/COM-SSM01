package top.cms.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 权限表
 * @author yhmi
 */
public class SysAuth implements Serializable {
    /**
     * 权限表ID
     */
   private String authId;
    /**
     * 权限表url
     */
   private String authUrl;
    /**
     * 权限表父id
     */
   private String authFId;
    /**
     * 权限表名字
     */
   private String authName;
    /**
     * 权限表图标
     */
   private String authIcon;
    /**
     * 是否是菜单
     */
   private String authIsMenu;
   private List<SysRole> sysRoles;
    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public String getAuthFId() {
        return authFId;
    }

    public void setAuthFId(String authFId) {
        this.authFId = authFId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthIcon() {
        return authIcon;
    }

    public void setAuthIcon(String authIcon) {
        this.authIcon = authIcon;
    }

    public List<SysRole> getSysRoles() {
        return sysRoles;
    }

    public void setSysRoles(List<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
    }

    public String getAuthIsMenu() {
        return authIsMenu;
    }

    public void setAuthIsMenu(String authIsMenu) {
        this.authIsMenu = authIsMenu;
    }

    @Override
    public String toString() {
        return "SysAuth{" +
                "authId='" + authId + '\'' +
                ", authUrl='" + authUrl + '\'' +
                ", authFId='" + authFId + '\'' +
                ", authName='" + authName + '\'' +
                ", authIcon='" + authIcon + '\'' +
                ", authIsMenu='" + authIsMenu + '\'' +
                ", sysRoles=" + sysRoles +
                '}';
    }
}
