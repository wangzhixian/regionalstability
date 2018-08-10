package cn.yuchen.bigdate.rs.sysmanage.controller;

import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysRolePowerVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserRoleVo;
import cn.yuchen.bigdate.rs.sysmanage.service.SysRolePowerService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/8/9.
 */
@RestController
@RequestMapping("/sysrolepower")
@CrossOrigin
public class SysRolePowerController {

    @Autowired
    private SysRolePowerService sysRolePowerService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody SysRolePowerVo sysRolePowerVo){
        Boolean result = false;
        int addFlag = sysRolePowerService.add(sysRolePowerVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = sysRolePowerService.deleteByRoleId(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/find/{id}")
    public ResponseResult<List<SysRolePowerVo>> findByUserId(@PathVariable("id") Long id){
        List<SysRolePowerVo> sysRolePowerVos = sysRolePowerService.findByRoleId(id);
        return new ResponseResult<>(sysRolePowerVos);
    }

}
