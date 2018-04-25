package top.cms.bean;

/**
 * 文章
 * @author yhmi
 */
public class Wirter {
    /**
     * 文章id
     */
    private String wId;
    /**
     * 用户id
     */
    private String uId;
    /**
     * 文章标题
     */
    private  String title;
    /**
     * 文章内容
     */
    private String text;
    /**
     * 文章类型
     */
    private String wTypeId;
    /**
     * 文章状态
     */
    private String wSign;

    private Wtype wtype;
    private SysUser sysUser;

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getwTypeId() {
        return wTypeId;
    }

    public void setwTypeId(String wTypeId) {
        this.wTypeId = wTypeId;
    }

    public String getwSign() {
        return wSign;
    }

    public void setwSign(String wSign) {
        this.wSign = wSign;
    }

    public Wtype getWtype() {
        return wtype;
    }

    public void setWtype(Wtype wtype) {
        this.wtype = wtype;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    @Override
    public String toString() {
        return "Wirter{" +
                "wId='" + wId + '\'' +
                ", uId='" + uId + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", wTypeId='" + wTypeId + '\'' +
                ", wSign='" + wSign + '\'' +
                ", wtype=" + wtype +
                ", sysUser=" + sysUser +
                '}';
    }
}
