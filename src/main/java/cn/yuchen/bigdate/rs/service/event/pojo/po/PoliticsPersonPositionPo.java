package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

/**
 * 人物职位关系对象
 */
public class PoliticsPersonPositionPo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 人物的ID
     */
    private Integer personId;
    /**
     * 所对应职务的ID
     */

    private Integer positionId;
    /**
     * 职务开始的日期
     */

    private Date startDate;
    /**
     * 职务结束的日期
     */

    private Date endDate;
    /**
     * 是否逻辑删除 0 正常 1 删除
     */

    private Integer deleted;

    /**
     * 操作人员
     */

    private String operator;
    /**
     *创建时间
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

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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