package cn.yuchen.bigdate.rs.usermanagement.service.impl;

import cn.yuchen.bigdate.rs.usermanagement.dao.UserDao;
import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import cn.yuchen.bigdate.rs.usermanagement.repository.UserRep;
import cn.yuchen.bigdate.rs.usermanagement.repository.UserRepository;
import cn.yuchen.bigdate.rs.usermanagement.service.UserService;


import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.HttpRequest;
import cn.yuchen.bigdate.rs.utility.LogUtils;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

//    @Autowired
//    private UserRep userRep;

    @Override
    public UserVo findUserVoById(Integer id){
        AssertUtils.greaterThanZero(id,"id不能为空且不能小于等于0");
        UserPo userPo = userDao.selectUserPoById(id);
        //记录操作日志
        LogUtils logUtils = new LogUtils();
        //addOperatedLog(SqlSessionFactory，调用接口类名，调用接口方法名,参数名，参数值)
        logUtils.addOperatedLog(sqlSessionFactory,UserDao.class.getName(),"selectUserPoById","id",id);
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

    @Override
    public UserVo fundUserVoForDB() {
        UserPo userPo = userRepository.findByUserName("测试");    // 只写MongoDB接口的方式   实现交于Springboot实现
//        UserPo userPo = userRep.getUserPo();    自己写MongoDB接口与实现类的方式
        UserVo vo = new UserVo();
        BeanUtils.copyProperties(userPo,vo);
        return vo;
    }
}
