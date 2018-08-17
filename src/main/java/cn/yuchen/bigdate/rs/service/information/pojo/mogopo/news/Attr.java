package cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzx on 2018/8/14.
 */
public class Attr implements Serializable {

    private static final long serialVersionUID = 7351427448054645331L;
    /**
     * id
     */
    private String id;

    /**
     * 原新闻语言
     */
    private String region;

    /**
     * 原新闻标题
     */
    private String news_name;

    /**
     * 原新闻内容
     */
    private String content;

    /**
     * 发生时间
     */
    private String publicDateTime;

    /**
     * 地点(国家)
     */
    private String area;

    /**
     * 人物
     */
    private String persons;

    /**
     * 状态：0 未处理，1 已处理
     */
    private Integer status;
    /**
     * 逻辑删除：0 未删除，1 已删除
     */
    private Integer deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNews_name() {
        return news_name;
    }

    public void setNews_name(String news_name) {
        this.news_name = news_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublicDateTime() {
        return publicDateTime;
    }

    public void setPublicDateTime(String publicDateTime) {
        this.publicDateTime = publicDateTime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Attr{" +
                "id='" + id + '\'' +
                ", region='" + region + '\'' +
                ", news_name='" + news_name + '\'' +
                ", content='" + content + '\'' +
                ", publicDateTime='" + publicDateTime + '\'' +
                ", area='" + area + '\'' +
                ", persons='" + persons + '\'' +
                ", status=" + status +
                ", deleted=" + deleted +
                '}';
    }
}
