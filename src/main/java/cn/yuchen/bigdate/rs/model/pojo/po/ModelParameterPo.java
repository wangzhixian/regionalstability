package cn.yuchen.bigdate.rs.model.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class ModelParameterPo implements Serializable {
    /**
     * 唯一主键
     */
    private Long id;
    /**
     * 方法ID（外键）
     */
    private Long methodId;
    /**
     * 关联专家参数结果ID
     */
    private Long xId;
    /**
     * 参数名称
     */
    private String name;
    /**
     * 参数描述
     */
    private String script;
    /**
     * 参数类型: system 系统 , expert  专家 , personal 个人
     */
    private String category;
    /**
     * 参数归属人ID ，0 代表系统
     */
    private Long owerid;

    /**
     * 逻辑删除: 0 正常 1 删除
     */
    private Integer deleted;
    /**
     * 操作人员
     */
    private String operator;
    /**
     * 创建时间
     */
    private Date insertTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMethodId() {
        return methodId;
    }

    public void setMethodId(Long methodId) {
        this.methodId = methodId;
    }

    public Long getxId() {
        return xId;
    }

    public void setxId(Long xId) {
        this.xId = xId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Long getOwerid() {
        return owerid;
    }

    public void setOwerid(Long owerid) {
        this.owerid = owerid;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ModelParameterPo{" +
                "id=" + id +
                ", methodId=" + methodId +
                ", xId=" + xId +
                ", name='" + name + '\'' +
                ", script='" + script + '\'' +
                ", category='" + category + '\'' +
                ", owerid=" + owerid +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}