package cn.yuchen.bigdate.rs.usermanagement.service.impl;

import cn.yuchen.bigdate.rs.usermanagement.dao.UserDao;
import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import cn.yuchen.bigdate.rs.usermanagement.repository.UserRep;
import cn.yuchen.bigdate.rs.usermanagement.repository.UserRepository;
import cn.yuchen.bigdate.rs.usermanagement.service.UserService;


import cn.yuchen.bigdate.rs.utility.AssertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRep userRep;

    @Override
    public UserVo findUserVoById(Integer id){
        AssertUtils.greaterThanZero(id,"id不能为空且不能小于等于0");
        UserPo userPo = userDao.selectUserPoById(id);
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userPo, userVo);    //BeanUtils.copyProperties(m,n);  对象m中的属性复制到对象n中
        return userVo;
    }

    @Override
    public int addUserVo(UserVo userVo){
        AssertUtils.notNull(userVo,"添加对象不能为空");
        AssertUtils.hasText(userVo.getUserName(),"用户名不能为空");
        AssertUtils.hasText(userVo.getPassword(),"密码不能为空");
        AssertUtils.greaterThanZero(userVo.getAge(),"年龄不能为空且不能小于等于0");
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userVo, userPo);
        return userDao.insert(userPo);
    }

    @Override
    public void addUserVoForDB(UserVo userVo) {
        AssertUtils.notNull(userVo,"添加对象不能为空");
        AssertUtils.hasText(userVo.getUserName(),"用户名不能为空");
        AssertUtils.hasText(userVo.getPassword(),"密码不能为空");
        AssertUtils.greaterThanZero(userVo.getAge(),"年龄不能为空且不能小于等于0");
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userVo, userPo);
//        userRep.savaUser(userPo);
        userRepository.save(userPo);
    }
}
