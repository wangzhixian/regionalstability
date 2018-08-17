package cn.yuchen.bigdate.rs.usermanagement.service;

import cn.yuchen.bigdate.rs.usermanagement.pojo.mogopo.Tagdata;
import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import org.springframework.data.domain.Page;

import java.util.List;

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
    List<UserPo> fundUserVoForDB();

    /**
     * 获取db测试
     * @return
     */
    Page<Tagdata> findDB();
}
