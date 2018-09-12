package cn.yuchen.bigdate.rs.service.event.pojo.vo;

import java.util.Date;

public class GsvAreaVo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 组织英文名称
     */
    private String areaEnName;
    /**
     * 组织中文名称
     */
    private String areaZhName;
    /**
     * 上级名称(所属父类一级地区ID)
     */
    private Integer parentId;
    /**
     * 国家ID
     */
    private Integer countryId;
    /**
     * 国家全称
     */
    private String countryfullname;
    /**
     * 备注信息
     */
    private String areaRemark;
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

    public String getCountryfullname() {
        return countryfullname;
    }

    public void setCountryfullname(String countryfullname) {
        this.countryfullname = countryfullname;
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