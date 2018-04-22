package top.cms.bean;

import java.io.Serializable;

/**
 * @author yhmi
 * 用户表
 */
public class SysUser implements Serializable {
    /**
     * 用户id
     */
    private String uid;
    /**
     * 登录用户
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户创建时间
     */
    private String createTime;
    /**
     * 上一次登录时间
     */
    private String lastTime;
    /**
     * 用户登录时间
     */
    private String loginTime;
    /**
     * 用户生日
     */
    private String birthday;
    /**
     *用户性别
     */
    private Integer sex;
    /**
     * 用户姓名（登录完成显示的）
     */
    private String name;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户状态
     */
    private String address;
    private Integer sign;
    /**
     * 关联角色表id
     */
    private String roleId;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 重写的toString方法
     * @return
     */
    @Override
    public String toString() {
        return "SysUser{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastTime='" + lastTime + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", sign=" + sign +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
