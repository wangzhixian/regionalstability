package cn.yuchen.bigdate.rs.usermanagement.repository;

import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;

/**
 * 传统使用mongoDB的方式，创建接口和实现类。
 * Created by wzx on 2018/7/17.
 */
public interface UserRep {
    void savaUser(UserPo userPo);

    UserPo getUserPo();
}
