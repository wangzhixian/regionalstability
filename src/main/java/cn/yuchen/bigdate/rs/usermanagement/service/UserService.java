package cn.yuchen.bigdate.rs.usermanagement.service;

import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import org.springframework.beans.BeansException;

public interface UserService {
    /**
     * 通过id查询userVo
     * @param id
     * @return
     */
    UserVo findUserVoById(Integer id) throws Exception;

    /**
     * 添加用户
     * @param userVo
     * @return
     */
    int addUserVo(UserVo userVo)throws Exception;
}
