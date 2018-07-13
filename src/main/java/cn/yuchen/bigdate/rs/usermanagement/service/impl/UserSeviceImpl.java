package cn.yuchen.bigdate.rs.usermanagement.service.impl;

import cn.yuchen.bigdate.rs.usermanagement.dao.UserDao;
import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import cn.yuchen.bigdate.rs.usermanagement.service.UserService;


import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;


@Service
public class UserSeviceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserVo findUserVoById(Integer id) throws Exception{
        UserPo userPo = userDao.selectUserPoById(id);
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userVo,userPo);    //BeanUtils.copyProperties(m,n);  对象n中的属性复制到对象m中
        return userVo;
    }

    @Override
    public int addUserVo(UserVo userVo) throws InvocationTargetException, IllegalAccessException {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userPo,userVo);
        return userDao.insert(userPo);
    }
}
