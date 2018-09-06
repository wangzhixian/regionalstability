package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

public class GsvTerrorPo {
    private Integer id;

    private String terrorEnName;

    private String terrorZhName;

    private String terrorRemark;

    private Integer levelId;

    private Integer deleted;

    private String operator;

    private Date insertTime;

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