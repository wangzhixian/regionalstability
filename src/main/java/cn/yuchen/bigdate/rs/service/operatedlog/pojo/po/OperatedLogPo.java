package cn.yuchen.bigdate.rs.service.operatedlog.pojo.po;



import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作日志类
 * Created by wzx on 2018/7/24.
 */
public class OperatedLogPo implements Serializable {
    private static final long serialVersionUID = -1732684062639655412L;
    /**
     * 自增主键
     */
    private Integer id ;
    /**
     * 操作用户
     */
    private String operatedBy;
    /**
     * 操作sql
     */
    private String records;
    /**
     * 操作参数
     */
    private String properties;
    /**
     * 日志类型
     */
    private String operatedType;
    /**
     * 逻辑删除:0 正常， 1 删除
     */
    private int deleted;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")       //datetime  数据库转化格式
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")           //   json  转化格式
    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperatedBy() {
        return operatedBy;
    }

    public void setOperatedBy(String operatedBy) {
        this.operatedBy = operatedBy;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getOperatedType() {
        return operatedType;
    }

    public void setOperatedType(String operatedType) {
        this.operatedType = operatedType;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "OperatedLogPo{" +
                "id=" + id +
                ", operatedBy='" + operatedBy + '\'' +
                ", records='" + records + '\'' +
                ", properties='" + properties + '\'' +
                ", operatedType='" + operatedType + '\'' +
                ", deleted=" + deleted +
                ", createdTime=" + createdTime +
                '}';
    }
}
