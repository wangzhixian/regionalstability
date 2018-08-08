package cn.yuchen.bigdate.rs.sysmanage.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class SysUserPo implements Serializable {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户登录名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 真实姓名
     */
    private String truename;

    /**
     * 密码
     */
    private String password;

    /**
     * 逻辑删除: 0 正常 1 删除
     */
    private Integer deleted;

    /**
     * 操作人员
     */
    private String operator;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date insertTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    @Override
    public String toString() {
        return "SysUserPo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", truename='" + truename + '\'' +
                ", password='" + password + '\'' +
                ", deleted=" + deleted +
                ", operator='" + operator + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}