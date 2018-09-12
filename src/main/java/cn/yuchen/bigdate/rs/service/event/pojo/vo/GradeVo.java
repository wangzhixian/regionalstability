package cn.yuchen.bigdate.rs.service.event.pojo.vo;

import java.util.Date;

/**
 * 等级对象
 */
public class GradeVo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 维度：1、政治人物，2、行政区域，3、政府及政党，4、宗教组织，5、政治会议，6、伤亡人数，7、武器等级，8、恐怖组织，9、地理位置
     */
    private Integer dimensionality;
    /**
     * 所属国家的ID
     */
    private Integer countryId;
    /**
     * 等级ID: 1 第一级 ，2 第二级
     */
    private Integer level;
    /**
     * 等级描述
     */
    private String levelDesc;
    /**
     * 等级范畴,各范畴之间用,号分隔地区举例：shanghai,beijing
     */
    private String levelDetails;
    /**
     * 死亡计算范围，起始
     */
    private Integer dieStart;
    /**
     * 死亡计算范围，结束
     */
    private Integer dieEnd;
    /**
     * 受伤计算范围，起始
     */
    private Integer hurtStart;
    /**
     * 受伤计算范围，结束
     */
    private Integer hurtEnd;
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

    public Integer getDimensionality() {
        return dimensionality;
    }

    public void setDimensionality(Integer dimensionality) {
        this.dimensionality = dimensionality;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelDesc() {
        return levelDesc;
    }

    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc == null ? null : levelDesc.trim();
    }

    public String getLevelDetails() {
        return levelDetails;
    }

    public void setLevelDetails(String levelDetails) {
        this.levelDetails = levelDetails == null ? null : levelDetails.trim();
    }

    public Integer getDieStart() {
        return dieStart;
    }

    public void setDieStart(Integer dieStart) {
        this.dieStart = dieStart;
    }

    public Integer getDieEnd() {
        return dieEnd;
    }

    public void setDieEnd(Integer dieEnd) {
        this.dieEnd = dieEnd;
    }

    public Integer getHurtStart() {
        return hurtStart;
    }

    public void setHurtStart(Integer hurtStart) {
        this.hurtStart = hurtStart;
    }

    public Integer getHurtEnd() {
        return hurtEnd;
    }

    public void setHurtEnd(Integer hurtEnd) {
        this.hurtEnd = hurtEnd;
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
        return "GradeVo{" +
                "id=" + id +
                ", dimensionality=" + dimensionality +
                ", countryId=" + countryId +
                ", level=" + level +
                ", levelDesc='" + levelDesc + '\'' +
                ", levelDetails='" + levelDetails + '\'' +
                ", dieStart=" + dieStart +
                ", dieEnd=" + dieEnd +
                ", hurtStart=" + hurtStart +
                ", hurtEnd=" + hurtEnd +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}