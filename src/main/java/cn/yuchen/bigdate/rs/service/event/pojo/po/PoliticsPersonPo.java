package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

public class PoliticsPersonPo {
    private Integer id;

    private String cnName;

    private String enName;

    private String miniCnName;

    private String miniEnName;

    private Integer countryId;

    private Integer levelId;

    private Integer partygroupId;

    private String resum;

    private Integer area1;

    private Integer area2;

    private Integer area3;

    private String keyword;

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

    public String getResum() {
        return resum;
    }

    public void setResum(String resum) {
        this.resum = resum == null ? null : resum.trim();
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