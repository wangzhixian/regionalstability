package cn.yuchen.bigdate.rs.service.information.pojo.vo;

import java.util.Date;

public class EventBaseVo {

    private Long id;


    private String eventName;


    private String relevants;

    private String sites;


    private String countryfullname;


    private Date eventTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getRelevants() {
        return relevants;
    }

    public void setRelevants(String relevants) {
        this.relevants = relevants;
    }

    public String getSites() {
        return sites;
    }

    public void setSites(String sites) {
        this.sites = sites;
    }

    public String getCountryfullname() {
        return countryfullname;
    }

    public void setCountryfullname(String countryfullname) {
        this.countryfullname = countryfullname;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }
}