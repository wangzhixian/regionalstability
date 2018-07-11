package cn.yuchen.bigdate.rs.usermanagement.dao;

import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    UserPo selectUserPoById(Integer id);

    /**
     * 添加用户
     * @param userPo
     * @return
     */
    int insert(UserPo userPo);
}
