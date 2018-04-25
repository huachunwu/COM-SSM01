package top.cms.bean;

import java.io.Serializable;

/**
 * 事务提交
 * @author yhmi
 */
public class TxBug implements Serializable {
    /**
     * 事务id
     */
    private String txId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 创建时间
     */
    private String txCreatetime;
    /**
     * 任务类型
     */
    private String questionType;
    /**
     * 任务描述
     */
    private String questionDescribe;
    /**
     * 任务进度
     */
    private String questionSpeed;
    /**
     * 解决方案
     */
    private String solution;
    private SysUser sysUser;

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTxCreatetime() {
        return txCreatetime;
    }

    public void setTxCreatetime(String txCreatetime) {
        this.txCreatetime = txCreatetime;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionDescribe() {
        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe;
    }

    public String getQuestionSpeed() {
        return questionSpeed;
    }

    public void setQuestionSpeed(String questionSpeed) {
        this.questionSpeed = questionSpeed;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    @Override
    public String toString() {
        return "TxBug{" +
                "txId='" + txId + '\'' +
                ", userId='" + userId + '\'' +
                ", txCreatetime='" + txCreatetime + '\'' +
                ", questionType='" + questionType + '\'' +
                ", questionDescribe='" + questionDescribe + '\'' +
                ", questionSpeed='" + questionSpeed + '\'' +
                ", solution='" + solution + '\'' +
                ", sysUser=" + sysUser +
                '}';
    }
}
