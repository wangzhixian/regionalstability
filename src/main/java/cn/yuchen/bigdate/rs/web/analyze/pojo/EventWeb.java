package cn.yuchen.bigdate.rs.web.analyze.pojo;

import cn.yuchen.bigdate.rs.utility.PageUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class EventWeb {

    private List<Long> ids;

    private String eventName;

    private String relevants;

    private String sites;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eventTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    private Byte type;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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
}
