package cn.yuchen.bigdate.rs.service.hs.pojo.vo;

/**
 * Created by wzx on 2018/8/27.
 */
public class CountryVo {

    /**
     * 国家编号
     */
    private Integer number;
    /**
     * 国家国际名称
     */
    private String internetname;
    /**
     * 国家全称
     */
    private String countryfullname;
    /**
     * 国家英文名称
     */
    private String countrykeys;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getInternetname() {
        return internetname;
    }

    public void setInternetname(String internetname) {
        this.internetname = internetname;
    }

    public String getCountryfullname() {
        return countryfullname;
    }

    public void setCountryfullname(String countryfullname) {
        this.countryfullname = countryfullname;
    }

    public String getCountrykeys() {
        return countrykeys;
    }

    public void setCountrykeys(String countrykeys) {
        this.countrykeys = countrykeys;
    }

    @Override
    public String toString() {
        return "CountryVo{" +
                "number=" + number +
                ", internetname='" + internetname + '\'' +
                ", countryfullname='" + countryfullname + '\'' +
                ", countrykeys='" + countrykeys + '\'' +
                '}';
    }
}
