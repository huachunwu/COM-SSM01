package top.cms.bean;

/**
 * @author yhmi
 * 条件查询语句
 */
public class QueryVO {
    /**
     * 用户名
     */
    private String name;
    /**
     * 地址
     */
    private String address;
    /**
     * 状态
     */
    private String questionSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQuestionSpeed() {
        return questionSpeed;
    }

    public void setQuestionSpeed(String questionSpeed) {
        this.questionSpeed = questionSpeed;
    }

    @Override
    public String toString() {
        return "QueryVO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", questionSpeed='" + questionSpeed + '\'' +
                '}';
    }
}
