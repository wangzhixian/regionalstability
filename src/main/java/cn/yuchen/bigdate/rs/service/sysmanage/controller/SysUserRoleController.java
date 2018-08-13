package cn.yuchen.bigdate.rs.service.sysmanage.controller;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysUserRoleService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/8/9.
 */
@RestController
@RequestMapping("/sysuserrole")
@CrossOrigin
public class SysUserRoleController {

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody SysUserRoleVo sysUserRoleVo){
        Boolean result = false;
        int addFlag = sysUserRoleService.add(sysUserRoleVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = sysUserRoleService.deleteByUserId(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/find/{id}")
    public ResponseResult<List<SysUserRoleVo>> findByUserId(@PathVariable("id") Long id){
        List<SysUserRoleVo> sysUserRoleVos = sysUserRoleService.findByUserId(id);
        return new ResponseResult<>(sysUserRoleVos);
    }

}
