package cn.yuchen.bigdate.rs.model.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ModelVo implements Serializable {
    private static final long serialVersionUID = -5996731938007429200L;
    /**
     * 唯一主键
     */
    private Long id;
    /**
     * 模型名称
     */
    private String name;
    /**
     * 模型类型 :  politics 政治模型,economic 经济模型,terrorism 反恐模型 , stable 区域稳定性模型
     */
    private String scene;
    /**
     * 模型描述
     */
    private String script;

    /**
     * 使用模块id组，id之间使用;分隔，例如：1;2;3
     */
    private String modelModuleIds;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;
    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getModelModuleIds() {
        return modelModuleIds;
    }

    public void setModelModuleIds(String modelModuleIds) {
        this.modelModuleIds = modelModuleIds;
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
        return "ModelVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scene='" + scene + '\'' +
                ", script='" + script + '\'' +
                ", modelModuleIds='" + modelModuleIds + '\'' +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}