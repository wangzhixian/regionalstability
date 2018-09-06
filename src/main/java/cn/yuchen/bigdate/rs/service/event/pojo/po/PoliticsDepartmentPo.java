package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

/**
 * 部门对象
 */

public class PoliticsDepartmentPo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 部门中文名称
     */
    private String cnName;
    /**
     * 部门英文名称
     */

    private String enName;
    /**
     * 所属国家的ID
     */

    private Integer countryId;
    /**
     * 部门等级ID
     */

    private String countryfullname;

    public String getCountryfullname() {
        return countryfullname;
    }

    public void setCountryfullname(String countryfullname) {
        this.countryfullname = countryfullname;
    }

    private Integer levelId;
    /**
     *关键词
     */

    private String keyword;
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
     *最后更新时间
     */

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
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