package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

public class GsvAreaPo {

    private Integer id;

    private String areaEnName;

    private String areaZhName;

    private Integer parentId;

    private Integer countryId;

    private String areaRemark;

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

    public String getAreaEnName() {
        return areaEnName;
    }

    public void setAreaEnName(String areaEnName) {
        this.areaEnName = areaEnName == null ? null : areaEnName.trim();
    }

    public String getAreaZhName() {
        return areaZhName;
    }

    public void setAreaZhName(String areaZhName) {
        this.areaZhName = areaZhName == null ? null : areaZhName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getAreaRemark() {
        return areaRemark;
    }

    public void setAreaRemark(String areaRemark) {
        this.areaRemark = areaRemark == null ? null : areaRemark.trim();
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