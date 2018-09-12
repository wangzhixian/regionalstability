package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GradeVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.GradeService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 等级控制类
 * Created by wzx on 2018/9/11.
 */
@RestController
@RequestMapping("/grade")
@CrossOrigin
public class GradeController {
    @Autowired
    private GradeService gradeService;

    /**
     * 添加等级对象
     * @param gradeVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody GradeVo gradeVo) {
        Boolean result = false;
        int addFlag = gradeService.add(gradeVo);
        if (addFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID删除等级对象
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id) {
        Boolean result = false;
        int deleteFlag = gradeService.delete(id);
        if (deleteFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 等级对象信息修改
     * @param gradeVo
     * @return
     */
    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody GradeVo gradeVo) {
        Boolean result = false;
        int updateFlag = gradeService.update(gradeVo);
        if (updateFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID查询等级对象
     * @param id
     * @return
     */
    @PostMapping("/find/{id}")
    public ResponseResult<GradeVo> findById(@PathVariable("id") Integer id) {
        GradeVo gradeVo = gradeService.findById(id);
        return new ResponseResult<>(gradeVo);
    }

    /**
     * 根据条件（国家、维度、等级） 分页查询等级信息
     * @param politicsWeb
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<GradeVo>> findByPage(@RequestBody PoliticsWeb politicsWeb) {
        List<GradeVo> gradeVos = gradeService.findByPage(politicsWeb);
        return new ResponseResult<>(new PageInfo<>(gradeVos));
    }


}
