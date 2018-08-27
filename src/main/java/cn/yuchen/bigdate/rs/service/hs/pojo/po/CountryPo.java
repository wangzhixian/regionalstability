package cn.yuchen.bigdate.rs.service.hs.pojo.po;

public class CountryPo {

    private String countryid;

    private String countryname;
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

    private String region;

    private String initials;

    private String spellfull;

    private String spellfirst;

    private String litude;

    private Integer hotsort;

    private String isdelete;

    private String bak1;

    private String country;

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid == null ? null : countryid.trim();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

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
        this.internetname = internetname == null ? null : internetname.trim();
    }

    public String getCountryfullname() {
        return countryfullname;
    }

    public void setCountryfullname(String countryfullname) {
        this.countryfullname = countryfullname == null ? null : countryfullname.trim();
    }

    public String getCountrykeys() {
        return countrykeys;
    }

    public void setCountrykeys(String countrykeys) {
        this.countrykeys = countrykeys == null ? null : countrykeys.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials == null ? null : initials.trim();
    }

    public String getSpellfull() {
        return spellfull;
    }

    public void setSpellfull(String spellfull) {
        this.spellfull = spellfull == null ? null : spellfull.trim();
    }

    public String getSpellfirst() {
        return spellfirst;
    }

    public void setSpellfirst(String spellfirst) {
        this.spellfirst = spellfirst == null ? null : spellfirst.trim();
    }

    public String getLitude() {
        return litude;
    }

    public void setLitude(String litude) {
        this.litude = litude == null ? null : litude.trim();
    }

    public Integer getHotsort() {
        return hotsort;
    }

    public void setHotsort(Integer hotsort) {
        this.hotsort = hotsort;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    @Override
    public String toString() {
        return "CountryPo{" +
                "countryid='" + countryid + '\'' +
                ", countryname='" + countryname + '\'' +
                ", number=" + number +
                ", internetname='" + internetname + '\'' +
                ", countryfullname='" + countryfullname + '\'' +
                ", countrykeys='" + countrykeys + '\'' +
                ", region='" + region + '\'' +
                ", initials='" + initials + '\'' +
                ", spellfull='" + spellfull + '\'' +
                ", spellfirst='" + spellfirst + '\'' +
                ", litude='" + litude + '\'' +
                ", hotsort=" + hotsort +
                ", isdelete='" + isdelete + '\'' +
                ", bak1='" + bak1 + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}