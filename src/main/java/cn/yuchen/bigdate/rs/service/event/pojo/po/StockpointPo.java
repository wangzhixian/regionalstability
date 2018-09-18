package cn.yuchen.bigdate.rs.service.event.pojo.po;

import java.util.Date;

/**
 * 股指对象
 */
public class StockpointPo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 国家ID
     */
    private Integer countryId;
    /**
     * 日期，（若为空则为添加时间）
     */
    private Date day;
    /**
     * 股指 ，（最新价)
     */
    private Double rate;
    /**
     * 增长率(涨跌幅；存的小数，单位是%)
     */
    private Double growth;
    /**
     * 股指名称
     */
    private String stockName;
    /**
     * 股指简称
     */
    private String stockShort;
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

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getStockShort() {
        return stockShort;
    }

    public void setStockShort(String stockShort) {
        this.stockShort = stockShort == null ? null : stockShort.trim();
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