package cn.yuchen.bigdate.rs.sysmanage.pojo.webvo;

import cn.yuchen.bigdate.rs.utility.PageUtils;

/**
 * Created by wzx on 2018/8/8.
 */
public class SysPageVo extends PageUtils {
    /**
     * 用户登录名
     */
    private String username;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 真实名称
     */
    private String truename;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    @Override
    public String toString() {
        return "SysPageVo{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", truename='" + truename + '\'' +
                '}';
    }
}
