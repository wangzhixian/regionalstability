package cn.yuchen.bigdate.rs.service.information.pojo.webpo;

import cn.yuchen.bigdate.rs.utility.PageUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzx on 2018/8/16.
 */
public class NewsWeb extends PageUtils implements Serializable {
    /**
     * 状态：0 未处理，1 已处理(未入库)，2 已处理（已入库）
     */
    private Integer status;

    /**
     * 地点(国家)
     */
    private String area="" ;

    /**
     * 开始时间
     */
    private Date startTime ;

    /**
     * 结束时间
     */
    private Date endTime ;


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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
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
