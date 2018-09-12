package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

public class GsvWeaponPo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 武器英文名称
     */
    private String weaponEnName;
    /**
     * 武器中文名称
     */
    private String weaponZhName;
    /**
     * 武器描述
     */
    private String weaponDesc;
    /**
     * 备注信息
     */
    private String weaponRemark;
    /**
     * 影响等级(外键)
     */
    private Integer levelId;
    /**
     * 是否逻辑删除 0 正常 1 删
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

    public String getWeaponEnName() {
        return weaponEnName;
    }

    public void setWeaponEnName(String weaponEnName) {
        this.weaponEnName = weaponEnName == null ? null : weaponEnName.trim();
    }

    public String getWeaponZhName() {
        return weaponZhName;
    }

    public void setWeaponZhName(String weaponZhName) {
        this.weaponZhName = weaponZhName == null ? null : weaponZhName.trim();
    }

    public String getWeaponDesc() {
        return weaponDesc;
    }

    public void setWeaponDesc(String weaponDesc) {
        this.weaponDesc = weaponDesc == null ? null : weaponDesc.trim();
    }

    public String getWeaponRemark() {
        return weaponRemark;
    }

    public void setWeaponRemark(String weaponRemark) {
        this.weaponRemark = weaponRemark == null ? null : weaponRemark.trim();
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