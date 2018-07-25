package cn.yuchen.bigdate.rs.usermanagement.service;

import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import org.apache.catalina.User;
import org.springframework.beans.BeansException;

import java.lang.reflect.InvocationTargetException;

public interface UserService {
    /**
     * 通过id查询userVo
     * @param id
     * @return
     */
    UserVo findUserVoById(Integer id);

    /**
     * 添加用户
     * @param userVo
     * @return
     */
    int addUserVo(UserVo userVo);

    /**
     * 添加用户到MongoDB里
     * @param userVo
     */
    void addUserVoForDB(UserVo userVo);

    /**
     * 从MongoDB中取对象
     * @return
     */
    UserVo fundUserVoForDB();
}
