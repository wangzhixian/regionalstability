package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

public class GsvTerrorPo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 组织英文名称
     */
    private String terrorEnName;
    /**
     * 组织中文名称
     */
    private String terrorZhName;
    /**
     * 备注信息
     */
    private String terrorRemark;
    /**
     * 影响等级(外键)
     */

    private Integer levelId;
    /**
     * 是否逻辑删除 0 正常 1 删除
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
     * 最后更新时间
     */

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTerrorEnName() {
        return terrorEnName;
    }

    public void setTerrorEnName(String terrorEnName) {
        this.terrorEnName = terrorEnName == null ? null : terrorEnName.trim();
    }

    public String getTerrorZhName() {
        return terrorZhName;
    }

    public void setTerrorZhName(String terrorZhName) {
        this.terrorZhName = terrorZhName == null ? null : terrorZhName.trim();
    }

    public String getTerrorRemark() {
        return terrorRemark;
    }

    public void setTerrorRemark(String terrorRemark) {
        this.terrorRemark = terrorRemark == null ? null : terrorRemark.trim();
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
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
}