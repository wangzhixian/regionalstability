package cn.yuchen.bigdate.rs.sysmanage.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class SysPowerPo implements Serializable {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 权限名称
     */
    private String powerName;

    /**
     * 权限描述
     */
    private String powerScript;

    /**
     * 权限Code
     */
    private String powerCode;

    /**
     * 权限父ID，只记录最接近的上一层ID
     */
    private Long parentId;

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

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getPowerScript() {
        return powerScript;
    }

    public void setPowerScript(String powerScript) {
        this.powerScript = powerScript == null ? null : powerScript.trim();
    }

    public String getPowerCode() {
        return powerCode;
    }

    public void setPowerCode(String powerCode) {
        this.powerCode = powerCode == null ? null : powerCode.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
        return "SysPowerPo{" +
                "id=" + id +
                ", powerName='" + powerName + '\'' +
                ", powerScript='" + powerScript + '\'' +
                ", powerCode='" + powerCode + '\'' +
                ", parentId=" + parentId +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}