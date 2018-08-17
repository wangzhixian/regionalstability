package cn.yuchen.bigdate.rs.service.information.pojo.webpo;

import cn.yuchen.bigdate.rs.utility.PageUtils;

import java.io.Serializable;

/**
 * Created by wzx on 2018/8/16.
 */
public class NewsWeb extends PageUtils implements Serializable {
    /**
     * 状态：0 未处理，1 已处理
     */
    private Integer status = 0;

    /**
     * 地点(国家)
     */
    private String area = "";

    /**
     * 开始时间
     */
    private String startTime = "";

    /**
     * 结束时间
     */
    private String endTime = "";

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "NewsPage{" +
                "status=" + status +
                ", area='" + area + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
