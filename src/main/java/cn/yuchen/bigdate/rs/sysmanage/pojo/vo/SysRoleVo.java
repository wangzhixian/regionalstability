package cn.yuchen.bigdate.rs.sysmanage.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class SysRoleVo implements Serializable {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleScript;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleScript() {
        return roleScript;
    }

    public void setRoleScript(String roleScript) {
        this.roleScript = roleScript == null ? null : roleScript.trim();
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
        return "SysRolePo{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleScript='" + roleScript + '\'' +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}