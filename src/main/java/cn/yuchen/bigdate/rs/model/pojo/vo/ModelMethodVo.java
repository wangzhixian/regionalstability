package cn.yuchen.bigdate.rs.model.pojo.vo;

import java.io.Serializable;
import java.util.Date;

public class ModelMethodVo implements Serializable {
    private static final long serialVersionUID = -303139944605977724L;
    /**
     * 唯一主键
     */
    private Long id;
    /**
     * 模型ID（外键）
     */
    private Long modelId;
    /**
     * 方法名称
     */
    private String name;
    /**
     * 方法描述
     */
    private String script;

    /**
     * 逻辑显示: 0 不显示 1 显示
     */
    private Integer display;

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

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
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
        this.operator = operator;
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
        return "ModelMethodVo{" +
                "id=" + id +
                ", modelId=" + modelId +
                ", name='" + name + '\'' +
                ", script='" + script + '\'' +
                ", display=" + display +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}