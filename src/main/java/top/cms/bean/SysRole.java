package top.cms.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author yhmi
 * 角色表
 */
public class SysRole implements Serializable {
    /**
     * 角色表Id
     */
    private String roleId;
    /**
     * 角色表Name
     */
    private String roleName;
    private List<SysAuth> sysAuths;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<SysAuth> getSysAuths() {
        return sysAuths;
    }

    public void setSysAuths(List<SysAuth> sysAuths) {
        this.sysAuths = sysAuths;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", sysAuths=" + sysAuths +
                '}';
    }
}
