package cn.yuchen.bigdate.rs.service.event.pojo.vo;

import java.util.Date;

/**
 * 人物对象
 */
public class PoliticsPersonVo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 人物中文名称
     */

    private String cnName;
    /**
     * 人物英文名称
     */

    private String enName;
    /**
     * 人物中文名称缩写
     */

    private String miniCnName;
    /**
     * 人物英文名称缩写
     */

    private String miniEnName;
    /**
     * 所属国家的ID
     */

    private Integer countryId;

    /**
     * 国家名称
     */


    private String countryfullname;
    /**
     * 部门英文名称
     */
    private String positionName;


    /**
     * 等级ID,默认为0表示没有等级
     */

    private Integer levelId;

    /**
     * 所属政党ID,默认为0表示没有政党
     */

    private Integer partygroupId;
    /**
     * 人物任职履历描述
     */

    private String resume;
    /**
     *人物所属一级行政区ID,默认为0表示没有一级行政区
     */
    private Integer area1;
    /**
     *人物所属二级行政区ID,默认为0表示没有二级行政区
     */
    private Integer area2;
    /**
     *人物所属三级地区ID（预留字段）,默认为0表示没有三级级行政区
     */
    private Integer area3;
    /**
     * 关键词
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
     * 最后更新时间
     */
    private Date updateTime;

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

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

    public String getMiniCnName() {
        return miniCnName;
    }

    public void setMiniCnName(String miniCnName) {
        this.miniCnName = miniCnName == null ? null : miniCnName.trim();
    }

    public String getMiniEnName() {
        return miniEnName;
    }

    public void setMiniEnName(String miniEnName) {
        this.miniEnName = miniEnName == null ? null : miniEnName.trim();
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

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getPartygroupId() {
        return partygroupId;
    }

    public void setPartygroupId(Integer partygroupId) {
        this.partygroupId = partygroupId;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public Integer getArea1() {
        return area1;
    }

    public void setArea1(Integer area1) {
        this.area1 = area1;
    }

    public Integer getArea2() {
        return area2;
    }

    public void setArea2(Integer area2) {
        this.area2 = area2;
    }

    public Integer getArea3() {
        return area3;
    }

    public void setArea3(Integer area3) {
        this.area3 = area3;
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