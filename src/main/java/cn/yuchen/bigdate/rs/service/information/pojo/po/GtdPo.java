package cn.yuchen.bigdate.rs.service.information.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class GtdPo implements Serializable {

    public GtdPo() {
    }

    public GtdPo(String eventid, String extended, String resolution, String country, String countryTxt, String region, String regionTxt, String provstate, String city, String latitude,
                 String longitude, String specificity, String vicinity, String location, String summary, String crit1, String crit2, String crit3, String doubtterr, String alternative,
                 String alternativeTxt, String multiple, String success, String suicide, String attacktype1, String attacktype1Txt, String attacktype2, String attacktype2Txt, String attacktype3, String attacktype3Txt,
                 String targtype1, String targtype1Txt, String targsubtype1, String targsubtype1Txt, String corp1, String target1, String natlty1, String natlty1Txt, String targtype2, String targtype2Txt,
                 String targsubtype2, String targsubtype2Txt, String corp2, String target2, String natlty2, String natlty2Txt, String targtype3, String targtype3Txt, String targsubtype3, String targsubtype3Txt,
                 String corp3, String target3, String natlty3, String natlty3Txt, String gname, String gsubname, String gname2, String gsubname2, String gname3, String gsubname3,
                 String motive, String guncertain1, String guncertain2, String guncertain3, String nperps, String nperpcap, String claimed, String claimmode, String claimmodeTxt, String claim2,
                 String claimmode2, String claimmode2Txt, String claim3, String claimmode3, String claimmode3Txt, String compclaim, String weaptype1, String weaptype1Txt, String weapsubtype1, String weapsubtype1Txt,
                 String weaptype2, String weaptype2Txt, String weapsubtype2, String weapsubtype2Txt, String weaptype3, String weaptype3Txt, String weapsubtype3, String weapsubtype3Txt, String weaptype4, String weaptype4Txt,
                 String weapsubtype4, String weapsubtype4Txt, String weapdetail, String nkill, String nkillus, String nkillter, String nwound, String nwoundus, String nwoundte, String property,
                 String propextent, String propextentTxt, String propvalue, String propcomment, String ishostkid, String nhostkid, String nhours, String ndays, String ransom, String ransomamt,
                 String ransompaid, String ransomnote, String hostkidoutcome, String hostkidoutcomeTxt, String nreleased) {
        this.eventid = eventid;
        this.extended = extended;
        this.resolution = resolution;
        this.country = country;
        this.countryTxt = countryTxt;
        this.region = region;
        this.regionTxt = regionTxt;
        this.provstate = provstate;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.specificity = specificity;
        this.vicinity = vicinity;
        this.location = location;
        this.summary = summary;
        this.crit1 = crit1;
        this.crit2 = crit2;
        this.crit3 = crit3;
        this.doubtterr = doubtterr;
        this.alternative = alternative;
        this.alternativeTxt = alternativeTxt;
        this.multiple = multiple;
        this.success = success;
        this.suicide = suicide;
        this.attacktype1 = attacktype1;
        this.attacktype1Txt = attacktype1Txt;
        this.attacktype2 = attacktype2;
        this.attacktype2Txt = attacktype2Txt;
        this.attacktype3 = attacktype3;
        this.attacktype3Txt = attacktype3Txt;
        this.targtype1 = targtype1;
        this.targtype1Txt = targtype1Txt;
        this.targsubtype1 = targsubtype1;
        this.targsubtype1Txt = targsubtype1Txt;
        this.corp1 = corp1;
        this.target1 = target1;
        this.natlty1 = natlty1;
        this.natlty1Txt = natlty1Txt;
        this.targtype2 = targtype2;
        this.targtype2Txt = targtype2Txt;
        this.targsubtype2 = targsubtype2;
        this.targsubtype2Txt = targsubtype2Txt;
        this.corp2 = corp2;
        this.target2 = target2;
        this.natlty2 = natlty2;
        this.natlty2Txt = natlty2Txt;
        this.targtype3 = targtype3;
        this.targtype3Txt = targtype3Txt;
        this.targsubtype3 = targsubtype3;
        this.targsubtype3Txt = targsubtype3Txt;
        this.corp3 = corp3;
        this.target3 = target3;
        this.natlty3 = natlty3;
        this.natlty3Txt = natlty3Txt;
        this.gname = gname;
        this.gsubname = gsubname;
        this.gname2 = gname2;
        this.gsubname2 = gsubname2;
        this.gname3 = gname3;
        this.gsubname3 = gsubname3;
        this.motive = motive;
        this.guncertain1 = guncertain1;
        this.guncertain2 = guncertain2;
        this.guncertain3 = guncertain3;
        this.nperps = nperps;
        this.nperpcap = nperpcap;
        this.claimed = claimed;
        this.claimmode = claimmode;
        this.claimmodeTxt = claimmodeTxt;
        this.claim2 = claim2;
        this.claimmode2 = claimmode2;
        this.claimmode2Txt = claimmode2Txt;
        this.claim3 = claim3;
        this.claimmode3 = claimmode3;
        this.claimmode3Txt = claimmode3Txt;
        this.compclaim = compclaim;
        this.weaptype1 = weaptype1;
        this.weaptype1Txt = weaptype1Txt;
        this.weapsubtype1 = weapsubtype1;
        this.weapsubtype1Txt = weapsubtype1Txt;
        this.weaptype2 = weaptype2;
        this.weaptype2Txt = weaptype2Txt;
        this.weapsubtype2 = weapsubtype2;
        this.weapsubtype2Txt = weapsubtype2Txt;
        this.weaptype3 = weaptype3;
        this.weaptype3Txt = weaptype3Txt;
        this.weapsubtype3 = weapsubtype3;
        this.weapsubtype3Txt = weapsubtype3Txt;
        this.weaptype4 = weaptype4;
        this.weaptype4Txt = weaptype4Txt;
        this.weapsubtype4 = weapsubtype4;
        this.weapsubtype4Txt = weapsubtype4Txt;
        this.weapdetail = weapdetail;
        this.nkill = nkill;
        this.nkillus = nkillus;
        this.nkillter = nkillter;
        this.nwound = nwound;
        this.nwoundus = nwoundus;
        this.nwoundte = nwoundte;
        this.property = property;
        this.propextent = propextent;
        this.propextentTxt = propextentTxt;
        this.propvalue = propvalue;
        this.propcomment = propcomment;
        this.ishostkid = ishostkid;
        this.nhostkid = nhostkid;
        this.nhours = nhours;
        this.ndays = ndays;
        this.ransom = ransom;
        this.ransomamt = ransomamt;
        this.ransompaid = ransompaid;
        this.ransomnote = ransomnote;
        this.hostkidoutcome = hostkidoutcome;
        this.hostkidoutcomeTxt = hostkidoutcomeTxt;
        this.nreleased = nreleased;
    }

    private Long id;

    private String eventid;

    /**
     * 新闻名称(预留字段)
     */
    private String eventName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eventTime;

    private String extended;

    private String resolution;

    private String country;

    private String countryTxt;

    private String region;

    private String regionTxt;

    private String provstate;

    private String city;

    private String latitude;

    private String longitude;

    private String specificity;

    private String vicinity;

    private String location;

    private String summary;

    private String crit1;

    private String crit2;

    private String crit3;

    private String doubtterr;

    private String alternative;

    private String alternativeTxt;

    private String multiple;

    private String success;

    private String suicide;

    private String attacktype1;

    private String attacktype1Txt;

    private String attacktype2;

    private String attacktype2Txt;

    private String attacktype3;

    private String attacktype3Txt;

    private String targtype1;

    private String targtype1Txt;

    private String targsubtype1;

    private String targsubtype1Txt;

    private String corp1;

    private String target1;

    private String natlty1;

    private String natlty1Txt;

    private String targtype2;

    private String targtype2Txt;

    private String targsubtype2;

    private String targsubtype2Txt;

    private String corp2;

    private String target2;

    private String natlty2;

    private String natlty2Txt;

    private String targtype3;

    private String targtype3Txt;

    private String targsubtype3;

    private String targsubtype3Txt;

    private String corp3;

    private String target3;

    private String natlty3;

    private String natlty3Txt;

    private String gname;

    private String gsubname;

    private String gname2;

    private String gsubname2;

    private String gname3;

    private String gsubname3;

    private String motive;

    private String guncertain1;

    private String guncertain2;

    private String guncertain3;

    private String nperps;

    private String nperpcap;

    private String claimed;

    private String claimmode;

    private String claimmodeTxt;

    private String claim2;

    private String claimmode2;

    private String claimmode2Txt;

    private String claim3;

    private String claimmode3;

    private String claimmode3Txt;

    private String compclaim;

    private String weaptype1;

    private String weaptype1Txt;

    private String weapsubtype1;

    private String weapsubtype1Txt;

    private String weaptype2;

    private String weaptype2Txt;

    private String weapsubtype2;

    private String weapsubtype2Txt;

    private String weaptype3;

    private String weaptype3Txt;

    private String weapsubtype3;

    private String weapsubtype3Txt;

    private String weaptype4;

    private String weaptype4Txt;

    private String weapsubtype4;

    private String weapsubtype4Txt;

    private String weapdetail;

    private String nkill;

    private String nkillus;

    private String nkillter;

    private String nwound;

    private String nwoundus;

    private String nwoundte;

    private String property;

    private String propextent;

    private String propextentTxt;

    private String propvalue;

    private String propcomment;

    private String ishostkid;

    private String nhostkid;

    private String nhours;

    private String ndays;

    private String ransom;

    private String ransomamt;

    private String ransompaid;

    private String ransomnote;

    private String hostkidoutcome;

    private String hostkidoutcomeTxt;

    private String nreleased;

    private Integer deleted;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid == null ? null : eventid.trim();
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getExtended() {
        return extended;
    }

    public void setExtended(String extended) {
        this.extended = extended == null ? null : extended.trim();
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution == null ? null : resolution.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCountryTxt() {
        return countryTxt;
    }

    public void setCountryTxt(String countryTxt) {
        this.countryTxt = countryTxt == null ? null : countryTxt.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getRegionTxt() {
        return regionTxt;
    }

    public void setRegionTxt(String regionTxt) {
        this.regionTxt = regionTxt == null ? null : regionTxt.trim();
    }

    public String getProvstate() {
        return provstate;
    }

    public void setProvstate(String provstate) {
        this.provstate = provstate == null ? null : provstate.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getSpecificity() {
        return specificity;
    }

    public void setSpecificity(String specificity) {
        this.specificity = specificity == null ? null : specificity.trim();
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity == null ? null : vicinity.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getCrit1() {
        return crit1;
    }

    public void setCrit1(String crit1) {
        this.crit1 = crit1 == null ? null : crit1.trim();
    }

    public String getCrit2() {
        return crit2;
    }

    public void setCrit2(String crit2) {
        this.crit2 = crit2 == null ? null : crit2.trim();
    }

    public String getCrit3() {
        return crit3;
    }

    public void setCrit3(String crit3) {
        this.crit3 = crit3 == null ? null : crit3.trim();
    }

    public String getDoubtterr() {
        return doubtterr;
    }

    public void setDoubtterr(String doubtterr) {
        this.doubtterr = doubtterr == null ? null : doubtterr.trim();
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative == null ? null : alternative.trim();
    }

    public String getAlternativeTxt() {
        return alternativeTxt;
    }

    public void setAlternativeTxt(String alternativeTxt) {
        this.alternativeTxt = alternativeTxt == null ? null : alternativeTxt.trim();
    }

    public String getMultiple() {
        return multiple;
    }

    public void setMultiple(String multiple) {
        this.multiple = multiple == null ? null : multiple.trim();
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success == null ? null : success.trim();
    }

    public String getSuicide() {
        return suicide;
    }

    public void setSuicide(String suicide) {
        this.suicide = suicide == null ? null : suicide.trim();
    }

    public String getAttacktype1() {
        return attacktype1;
    }

    public void setAttacktype1(String attacktype1) {
        this.attacktype1 = attacktype1 == null ? null : attacktype1.trim();
    }

    public String getAttacktype1Txt() {
        return attacktype1Txt;
    }

    public void setAttacktype1Txt(String attacktype1Txt) {
        this.attacktype1Txt = attacktype1Txt == null ? null : attacktype1Txt.trim();
    }

    public String getAttacktype2() {
        return attacktype2;
    }

    public void setAttacktype2(String attacktype2) {
        this.attacktype2 = attacktype2 == null ? null : attacktype2.trim();
    }

    public String getAttacktype2Txt() {
        return attacktype2Txt;
    }

    public void setAttacktype2Txt(String attacktype2Txt) {
        this.attacktype2Txt = attacktype2Txt == null ? null : attacktype2Txt.trim();
    }

    public String getAttacktype3() {
        return attacktype3;
    }

    public void setAttacktype3(String attacktype3) {
        this.attacktype3 = attacktype3 == null ? null : attacktype3.trim();
    }

    public String getAttacktype3Txt() {
        return attacktype3Txt;
    }

    public void setAttacktype3Txt(String attacktype3Txt) {
        this.attacktype3Txt = attacktype3Txt == null ? null : attacktype3Txt.trim();
    }

    public String getTargtype1() {
        return targtype1;
    }

    public void setTargtype1(String targtype1) {
        this.targtype1 = targtype1 == null ? null : targtype1.trim();
    }

    public String getTargtype1Txt() {
        return targtype1Txt;
    }

    public void setTargtype1Txt(String targtype1Txt) {
        this.targtype1Txt = targtype1Txt == null ? null : targtype1Txt.trim();
    }

    public String getTargsubtype1() {
        return targsubtype1;
    }

    public void setTargsubtype1(String targsubtype1) {
        this.targsubtype1 = targsubtype1 == null ? null : targsubtype1.trim();
    }

    public String getTargsubtype1Txt() {
        return targsubtype1Txt;
    }

    public void setTargsubtype1Txt(String targsubtype1Txt) {
        this.targsubtype1Txt = targsubtype1Txt == null ? null : targsubtype1Txt.trim();
    }

    public String getCorp1() {
        return corp1;
    }

    public void setCorp1(String corp1) {
        this.corp1 = corp1 == null ? null : corp1.trim();
    }

    public String getTarget1() {
        return target1;
    }

    public void setTarget1(String target1) {
        this.target1 = target1 == null ? null : target1.trim();
    }

    public String getNatlty1() {
        return natlty1;
    }

    public void setNatlty1(String natlty1) {
        this.natlty1 = natlty1 == null ? null : natlty1.trim();
    }

    public String getNatlty1Txt() {
        return natlty1Txt;
    }

    public void setNatlty1Txt(String natlty1Txt) {
        this.natlty1Txt = natlty1Txt == null ? null : natlty1Txt.trim();
    }

    public String getTargtype2() {
        return targtype2;
    }

    public void setTargtype2(String targtype2) {
        this.targtype2 = targtype2 == null ? null : targtype2.trim();
    }

    public String getTargtype2Txt() {
        return targtype2Txt;
    }

    public void setTargtype2Txt(String targtype2Txt) {
        this.targtype2Txt = targtype2Txt == null ? null : targtype2Txt.trim();
    }

    public String getTargsubtype2() {
        return targsubtype2;
    }

    public void setTargsubtype2(String targsubtype2) {
        this.targsubtype2 = targsubtype2 == null ? null : targsubtype2.trim();
    }

    public String getTargsubtype2Txt() {
        return targsubtype2Txt;
    }

    public void setTargsubtype2Txt(String targsubtype2Txt) {
        this.targsubtype2Txt = targsubtype2Txt == null ? null : targsubtype2Txt.trim();
    }

    public String getCorp2() {
        return corp2;
    }

    public void setCorp2(String corp2) {
        this.corp2 = corp2 == null ? null : corp2.trim();
    }

    public String getTarget2() {
        return target2;
    }

    public void setTarget2(String target2) {
        this.target2 = target2 == null ? null : target2.trim();
    }

    public String getNatlty2() {
        return natlty2;
    }

    public void setNatlty2(String natlty2) {
        this.natlty2 = natlty2 == null ? null : natlty2.trim();
    }

    public String getNatlty2Txt() {
        return natlty2Txt;
    }

    public void setNatlty2Txt(String natlty2Txt) {
        this.natlty2Txt = natlty2Txt == null ? null : natlty2Txt.trim();
    }

    public String getTargtype3() {
        return targtype3;
    }

    public void setTargtype3(String targtype3) {
        this.targtype3 = targtype3 == null ? null : targtype3.trim();
    }

    public String getTargtype3Txt() {
        return targtype3Txt;
    }

    public void setTargtype3Txt(String targtype3Txt) {
        this.targtype3Txt = targtype3Txt == null ? null : targtype3Txt.trim();
    }

    public String getTargsubtype3() {
        return targsubtype3;
    }

    public void setTargsubtype3(String targsubtype3) {
        this.targsubtype3 = targsubtype3 == null ? null : targsubtype3.trim();
    }

    public String getTargsubtype3Txt() {
        return targsubtype3Txt;
    }

    public void setTargsubtype3Txt(String targsubtype3Txt) {
        this.targsubtype3Txt = targsubtype3Txt == null ? null : targsubtype3Txt.trim();
    }

    public String getCorp3() {
        return corp3;
    }

    public void setCorp3(String corp3) {
        this.corp3 = corp3 == null ? null : corp3.trim();
    }

    public String getTarget3() {
        return target3;
    }

    public void setTarget3(String target3) {
        this.target3 = target3 == null ? null : target3.trim();
    }

    public String getNatlty3() {
        return natlty3;
    }

    public void setNatlty3(String natlty3) {
        this.natlty3 = natlty3 == null ? null : natlty3.trim();
    }

    public String getNatlty3Txt() {
        return natlty3Txt;
    }

    public void setNatlty3Txt(String natlty3Txt) {
        this.natlty3Txt = natlty3Txt == null ? null : natlty3Txt.trim();
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGsubname() {
        return gsubname;
    }

    public void setGsubname(String gsubname) {
        this.gsubname = gsubname == null ? null : gsubname.trim();
    }

    public String getGname2() {
        return gname2;
    }

    public void setGname2(String gname2) {
        this.gname2 = gname2 == null ? null : gname2.trim();
    }

    public String getGsubname2() {
        return gsubname2;
    }

    public void setGsubname2(String gsubname2) {
        this.gsubname2 = gsubname2 == null ? null : gsubname2.trim();
    }

    public String getGname3() {
        return gname3;
    }

    public void setGname3(String gname3) {
        this.gname3 = gname3 == null ? null : gname3.trim();
    }

    public String getGsubname3() {
        return gsubname3;
    }

    public void setGsubname3(String gsubname3) {
        this.gsubname3 = gsubname3 == null ? null : gsubname3.trim();
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive == null ? null : motive.trim();
    }

    public String getGuncertain1() {
        return guncertain1;
    }

    public void setGuncertain1(String guncertain1) {
        this.guncertain1 = guncertain1 == null ? null : guncertain1.trim();
    }

    public String getGuncertain2() {
        return guncertain2;
    }

    public void setGuncertain2(String guncertain2) {
        this.guncertain2 = guncertain2 == null ? null : guncertain2.trim();
    }

    public String getGuncertain3() {
        return guncertain3;
    }

    public void setGuncertain3(String guncertain3) {
        this.guncertain3 = guncertain3 == null ? null : guncertain3.trim();
    }

    public String getNperps() {
        return nperps;
    }

    public void setNperps(String nperps) {
        this.nperps = nperps == null ? null : nperps.trim();
    }

    public String getNperpcap() {
        return nperpcap;
    }

    public void setNperpcap(String nperpcap) {
        this.nperpcap = nperpcap == null ? null : nperpcap.trim();
    }

    public String getClaimed() {
        return claimed;
    }

    public void setClaimed(String claimed) {
        this.claimed = claimed == null ? null : claimed.trim();
    }

    public String getClaimmode() {
        return claimmode;
    }

    public void setClaimmode(String claimmode) {
        this.claimmode = claimmode == null ? null : claimmode.trim();
    }

    public String getClaimmodeTxt() {
        return claimmodeTxt;
    }

    public void setClaimmodeTxt(String claimmodeTxt) {
        this.claimmodeTxt = claimmodeTxt == null ? null : claimmodeTxt.trim();
    }

    public String getClaim2() {
        return claim2;
    }

    public void setClaim2(String claim2) {
        this.claim2 = claim2 == null ? null : claim2.trim();
    }

    public String getClaimmode2() {
        return claimmode2;
    }

    public void setClaimmode2(String claimmode2) {
        this.claimmode2 = claimmode2 == null ? null : claimmode2.trim();
    }

    public String getClaimmode2Txt() {
        return claimmode2Txt;
    }

    public void setClaimmode2Txt(String claimmode2Txt) {
        this.claimmode2Txt = claimmode2Txt == null ? null : claimmode2Txt.trim();
    }

    public String getClaim3() {
        return claim3;
    }

    public void setClaim3(String claim3) {
        this.claim3 = claim3 == null ? null : claim3.trim();
    }

    public String getClaimmode3() {
        return claimmode3;
    }

    public void setClaimmode3(String claimmode3) {
        this.claimmode3 = claimmode3 == null ? null : claimmode3.trim();
    }

    public String getClaimmode3Txt() {
        return claimmode3Txt;
    }

    public void setClaimmode3Txt(String claimmode3Txt) {
        this.claimmode3Txt = claimmode3Txt == null ? null : claimmode3Txt.trim();
    }

    public String getCompclaim() {
        return compclaim;
    }

    public void setCompclaim(String compclaim) {
        this.compclaim = compclaim == null ? null : compclaim.trim();
    }

    public String getWeaptype1() {
        return weaptype1;
    }

    public void setWeaptype1(String weaptype1) {
        this.weaptype1 = weaptype1 == null ? null : weaptype1.trim();
    }

    public String getWeaptype1Txt() {
        return weaptype1Txt;
    }

    public void setWeaptype1Txt(String weaptype1Txt) {
        this.weaptype1Txt = weaptype1Txt == null ? null : weaptype1Txt.trim();
    }

    public String getWeapsubtype1() {
        return weapsubtype1;
    }

    public void setWeapsubtype1(String weapsubtype1) {
        this.weapsubtype1 = weapsubtype1 == null ? null : weapsubtype1.trim();
    }

    public String getWeapsubtype1Txt() {
        return weapsubtype1Txt;
    }

    public void setWeapsubtype1Txt(String weapsubtype1Txt) {
        this.weapsubtype1Txt = weapsubtype1Txt == null ? null : weapsubtype1Txt.trim();
    }

    public String getWeaptype2() {
        return weaptype2;
    }

    public void setWeaptype2(String weaptype2) {
        this.weaptype2 = weaptype2 == null ? null : weaptype2.trim();
    }

    public String getWeaptype2Txt() {
        return weaptype2Txt;
    }

    public void setWeaptype2Txt(String weaptype2Txt) {
        this.weaptype2Txt = weaptype2Txt == null ? null : weaptype2Txt.trim();
    }

    public String getWeapsubtype2() {
        return weapsubtype2;
    }

    public void setWeapsubtype2(String weapsubtype2) {
        this.weapsubtype2 = weapsubtype2 == null ? null : weapsubtype2.trim();
    }

    public String getWeapsubtype2Txt() {
        return weapsubtype2Txt;
    }

    public void setWeapsubtype2Txt(String weapsubtype2Txt) {
        this.weapsubtype2Txt = weapsubtype2Txt == null ? null : weapsubtype2Txt.trim();
    }

    public String getWeaptype3() {
        return weaptype3;
    }

    public void setWeaptype3(String weaptype3) {
        this.weaptype3 = weaptype3 == null ? null : weaptype3.trim();
    }

    public String getWeaptype3Txt() {
        return weaptype3Txt;
    }

    public void setWeaptype3Txt(String weaptype3Txt) {
        this.weaptype3Txt = weaptype3Txt == null ? null : weaptype3Txt.trim();
    }

    public String getWeapsubtype3() {
        return weapsubtype3;
    }

    public void setWeapsubtype3(String weapsubtype3) {
        this.weapsubtype3 = weapsubtype3 == null ? null : weapsubtype3.trim();
    }

    public String getWeapsubtype3Txt() {
        return weapsubtype3Txt;
    }

    public void setWeapsubtype3Txt(String weapsubtype3Txt) {
        this.weapsubtype3Txt = weapsubtype3Txt == null ? null : weapsubtype3Txt.trim();
    }

    public String getWeaptype4() {
        return weaptype4;
    }

    public void setWeaptype4(String weaptype4) {
        this.weaptype4 = weaptype4 == null ? null : weaptype4.trim();
    }

    public String getWeaptype4Txt() {
        return weaptype4Txt;
    }

    public void setWeaptype4Txt(String weaptype4Txt) {
        this.weaptype4Txt = weaptype4Txt == null ? null : weaptype4Txt.trim();
    }

    public String getWeapsubtype4() {
        return weapsubtype4;
    }

    public void setWeapsubtype4(String weapsubtype4) {
        this.weapsubtype4 = weapsubtype4 == null ? null : weapsubtype4.trim();
    }

    public String getWeapsubtype4Txt() {
        return weapsubtype4Txt;
    }

    public void setWeapsubtype4Txt(String weapsubtype4Txt) {
        this.weapsubtype4Txt = weapsubtype4Txt == null ? null : weapsubtype4Txt.trim();
    }

    public String getWeapdetail() {
        return weapdetail;
    }

    public void setWeapdetail(String weapdetail) {
        this.weapdetail = weapdetail == null ? null : weapdetail.trim();
    }

    public String getNkill() {
        return nkill;
    }

    public void setNkill(String nkill) {
        this.nkill = nkill == null ? null : nkill.trim();
    }

    public String getNkillus() {
        return nkillus;
    }

    public void setNkillus(String nkillus) {
        this.nkillus = nkillus == null ? null : nkillus.trim();
    }

    public String getNkillter() {
        return nkillter;
    }

    public void setNkillter(String nkillter) {
        this.nkillter = nkillter == null ? null : nkillter.trim();
    }

    public String getNwound() {
        return nwound;
    }

    public void setNwound(String nwound) {
        this.nwound = nwound == null ? null : nwound.trim();
    }

    public String getNwoundus() {
        return nwoundus;
    }

    public void setNwoundus(String nwoundus) {
        this.nwoundus = nwoundus == null ? null : nwoundus.trim();
    }

    public String getNwoundte() {
        return nwoundte;
    }

    public void setNwoundte(String nwoundte) {
        this.nwoundte = nwoundte == null ? null : nwoundte.trim();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public String getPropextent() {
        return propextent;
    }

    public void setPropextent(String propextent) {
        this.propextent = propextent == null ? null : propextent.trim();
    }

    public String getPropextentTxt() {
        return propextentTxt;
    }

    public void setPropextentTxt(String propextentTxt) {
        this.propextentTxt = propextentTxt == null ? null : propextentTxt.trim();
    }

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue == null ? null : propvalue.trim();
    }

    public String getPropcomment() {
        return propcomment;
    }

    public void setPropcomment(String propcomment) {
        this.propcomment = propcomment == null ? null : propcomment.trim();
    }

    public String getIshostkid() {
        return ishostkid;
    }

    public void setIshostkid(String ishostkid) {
        this.ishostkid = ishostkid == null ? null : ishostkid.trim();
    }

    public String getNhostkid() {
        return nhostkid;
    }

    public void setNhostkid(String nhostkid) {
        this.nhostkid = nhostkid == null ? null : nhostkid.trim();
    }

    public String getNhours() {
        return nhours;
    }

    public void setNhours(String nhours) {
        this.nhours = nhours == null ? null : nhours.trim();
    }

    public String getNdays() {
        return ndays;
    }

    public void setNdays(String ndays) {
        this.ndays = ndays == null ? null : ndays.trim();
    }

    public String getRansom() {
        return ransom;
    }

    public void setRansom(String ransom) {
        this.ransom = ransom == null ? null : ransom.trim();
    }

    public String getRansomamt() {
        return ransomamt;
    }

    public void setRansomamt(String ransomamt) {
        this.ransomamt = ransomamt == null ? null : ransomamt.trim();
    }

    public String getRansompaid() {
        return ransompaid;
    }

    public void setRansompaid(String ransompaid) {
        this.ransompaid = ransompaid == null ? null : ransompaid.trim();
    }

    public String getRansomnote() {
        return ransomnote;
    }

    public void setRansomnote(String ransomnote) {
        this.ransomnote = ransomnote == null ? null : ransomnote.trim();
    }

    public String getHostkidoutcome() {
        return hostkidoutcome;
    }

    public void setHostkidoutcome(String hostkidoutcome) {
        this.hostkidoutcome = hostkidoutcome == null ? null : hostkidoutcome.trim();
    }

    public String getHostkidoutcomeTxt() {
        return hostkidoutcomeTxt;
    }

    public void setHostkidoutcomeTxt(String hostkidoutcomeTxt) {
        this.hostkidoutcomeTxt = hostkidoutcomeTxt == null ? null : hostkidoutcomeTxt.trim();
    }

    public String getNreleased() {
        return nreleased;
    }

    public void setNreleased(String nreleased) {
        this.nreleased = nreleased == null ? null : nreleased.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
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

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "GtdPo{" +
                "id=" + id +
                ", eventid='" + eventid + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventTime=" + eventTime +
                ", extended='" + extended + '\'' +
                ", resolution='" + resolution + '\'' +
                ", country='" + country + '\'' +
                ", countryTxt='" + countryTxt + '\'' +
                ", region='" + region + '\'' +
                ", regionTxt='" + regionTxt + '\'' +
                ", provstate='" + provstate + '\'' +
                ", city='" + city + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", specificity='" + specificity + '\'' +
                ", vicinity='" + vicinity + '\'' +
                ", location='" + location + '\'' +
                ", summary='" + summary + '\'' +
                ", crit1='" + crit1 + '\'' +
                ", crit2='" + crit2 + '\'' +
                ", crit3='" + crit3 + '\'' +
                ", doubtterr='" + doubtterr + '\'' +
                ", alternative='" + alternative + '\'' +
                ", alternativeTxt='" + alternativeTxt + '\'' +
                ", multiple='" + multiple + '\'' +
                ", success='" + success + '\'' +
                ", suicide='" + suicide + '\'' +
                ", attacktype1='" + attacktype1 + '\'' +
                ", attacktype1Txt='" + attacktype1Txt + '\'' +
                ", attacktype2='" + attacktype2 + '\'' +
                ", attacktype2Txt='" + attacktype2Txt + '\'' +
                ", attacktype3='" + attacktype3 + '\'' +
                ", attacktype3Txt='" + attacktype3Txt + '\'' +
                ", targtype1='" + targtype1 + '\'' +
                ", targtype1Txt='" + targtype1Txt + '\'' +
                ", targsubtype1='" + targsubtype1 + '\'' +
                ", targsubtype1Txt='" + targsubtype1Txt + '\'' +
                ", corp1='" + corp1 + '\'' +
                ", target1='" + target1 + '\'' +
                ", natlty1='" + natlty1 + '\'' +
                ", natlty1Txt='" + natlty1Txt + '\'' +
                ", targtype2='" + targtype2 + '\'' +
                ", targtype2Txt='" + targtype2Txt + '\'' +
                ", targsubtype2='" + targsubtype2 + '\'' +
                ", targsubtype2Txt='" + targsubtype2Txt + '\'' +
                ", corp2='" + corp2 + '\'' +
                ", target2='" + target2 + '\'' +
                ", natlty2='" + natlty2 + '\'' +
                ", natlty2Txt='" + natlty2Txt + '\'' +
                ", targtype3='" + targtype3 + '\'' +
                ", targtype3Txt='" + targtype3Txt + '\'' +
                ", targsubtype3='" + targsubtype3 + '\'' +
                ", targsubtype3Txt='" + targsubtype3Txt + '\'' +
                ", corp3='" + corp3 + '\'' +
                ", target3='" + target3 + '\'' +
                ", natlty3='" + natlty3 + '\'' +
                ", natlty3Txt='" + natlty3Txt + '\'' +
                ", gname='" + gname + '\'' +
                ", gsubname='" + gsubname + '\'' +
                ", gname2='" + gname2 + '\'' +
                ", gsubname2='" + gsubname2 + '\'' +
                ", gname3='" + gname3 + '\'' +
                ", gsubname3='" + gsubname3 + '\'' +
                ", motive='" + motive + '\'' +
                ", guncertain1='" + guncertain1 + '\'' +
                ", guncertain2='" + guncertain2 + '\'' +
                ", guncertain3='" + guncertain3 + '\'' +
                ", nperps='" + nperps + '\'' +
                ", nperpcap='" + nperpcap + '\'' +
                ", claimed='" + claimed + '\'' +
                ", claimmode='" + claimmode + '\'' +
                ", claimmodeTxt='" + claimmodeTxt + '\'' +
                ", claim2='" + claim2 + '\'' +
                ", claimmode2='" + claimmode2 + '\'' +
                ", claimmode2Txt='" + claimmode2Txt + '\'' +
                ", claim3='" + claim3 + '\'' +
                ", claimmode3='" + claimmode3 + '\'' +
                ", claimmode3Txt='" + claimmode3Txt + '\'' +
                ", compclaim='" + compclaim + '\'' +
                ", weaptype1='" + weaptype1 + '\'' +
                ", weaptype1Txt='" + weaptype1Txt + '\'' +
                ", weapsubtype1='" + weapsubtype1 + '\'' +
                ", weapsubtype1Txt='" + weapsubtype1Txt + '\'' +
                ", weaptype2='" + weaptype2 + '\'' +
                ", weaptype2Txt='" + weaptype2Txt + '\'' +
                ", weapsubtype2='" + weapsubtype2 + '\'' +
                ", weapsubtype2Txt='" + weapsubtype2Txt + '\'' +
                ", weaptype3='" + weaptype3 + '\'' +
                ", weaptype3Txt='" + weaptype3Txt + '\'' +
                ", weapsubtype3='" + weapsubtype3 + '\'' +
                ", weapsubtype3Txt='" + weapsubtype3Txt + '\'' +
                ", weaptype4='" + weaptype4 + '\'' +
                ", weaptype4Txt='" + weaptype4Txt + '\'' +
                ", weapsubtype4='" + weapsubtype4 + '\'' +
                ", weapsubtype4Txt='" + weapsubtype4Txt + '\'' +
                ", weapdetail='" + weapdetail + '\'' +
                ", nkill='" + nkill + '\'' +
                ", nkillus='" + nkillus + '\'' +
                ", nkillter='" + nkillter + '\'' +
                ", nwound='" + nwound + '\'' +
                ", nwoundus='" + nwoundus + '\'' +
                ", nwoundte='" + nwoundte + '\'' +
                ", property='" + property + '\'' +
                ", propextent='" + propextent + '\'' +
                ", propextentTxt='" + propextentTxt + '\'' +
                ", propvalue='" + propvalue + '\'' +
                ", propcomment='" + propcomment + '\'' +
                ", ishostkid='" + ishostkid + '\'' +
                ", nhostkid='" + nhostkid + '\'' +
                ", nhours='" + nhours + '\'' +
                ", ndays='" + ndays + '\'' +
                ", ransom='" + ransom + '\'' +
                ", ransomamt='" + ransomamt + '\'' +
                ", ransompaid='" + ransompaid + '\'' +
                ", ransomnote='" + ransomnote + '\'' +
                ", hostkidoutcome='" + hostkidoutcome + '\'' +
                ", hostkidoutcomeTxt='" + hostkidoutcomeTxt + '\'' +
                ", nreleased='" + nreleased + '\'' +
                ", deleted=" + deleted +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}