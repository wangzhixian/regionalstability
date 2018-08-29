package cn.yuchen.bigdate.rs.service.event.pojo.webpage;

import cn.yuchen.bigdate.rs.utility.PageUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * 地区对象
 */
public class PoliticsAreaPage extends PageUtils implements Serializable {
    /**
     * 地区中文名称
     *
     */
    private String cnName;
    /**
     * 地区英文名称
     */
    private String enName;

    /**
     * 所属父类一级行政区ID
     */
    private Integer parentId;

    /**
     * 等级ID,默认为0表示没有等级
     */
    private Integer levelId;
    /**
     * 关键词
     */
    private String keyword;
    /**
     * 所属国家的ID
     */
    private Integer countryId;
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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
        return "PoliticsAreaPage{" +
                "cnName='" + cnName + '\'' +
                ", enName='" + enName + '\'' +
                ", parentId=" + parentId +
                ", levelId=" + levelId +
                ", keyword='" + keyword + '\'' +
                ", countryId=" + countryId +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}