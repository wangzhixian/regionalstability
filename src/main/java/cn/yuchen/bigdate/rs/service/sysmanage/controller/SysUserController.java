package cn.yuchen.bigdate.rs.service.sysmanage.controller;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysUserService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户控制类
 * Created by wzx on 2018/8/7.
 */
@RestController
@RequestMapping("/sysuser")
@CrossOrigin
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody SysUserVo sysUserVo){
        Boolean result = false;
        int addFlag = sysUserService.add(sysUserVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody SysUserVo sysUserVo){
        Boolean result = false;
        int updateFlag = sysUserService.update(sysUserVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = sysUserService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);

    }

    @PostMapping("/find/{id}")
    public ResponseResult<SysUserVo> findById(@PathVariable("id") Long id){
        SysUserVo vo = sysUserService.findById(id);
        return new ResponseResult<>(vo);
    }

    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<SysUserVo>> findByPage(@RequestBody SysPageVo sysPageVo){
        List<SysUserVo> sysUserVos =  sysUserService.findByPage(sysPageVo);
        return new ResponseResult<>(new PageInfo<>(sysUserVos));
    }

    /**
     * 初始化密码
     * @param id
     * @return
     */
    @PostMapping("/init/{id}")
    public ResponseResult<Boolean> update(@PathVariable("id") Long id){
        Boolean result = false;
        int updateFlag = sysUserService.init(id);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

}
