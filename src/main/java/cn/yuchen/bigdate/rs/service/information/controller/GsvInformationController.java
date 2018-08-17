package cn.yuchen.bigdate.rs.service.information.controller;

import cn.yuchen.bigdate.rs.service.information.service.GsvInformationService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 反恐数据控制器
 * Created by wzx on 2018/8/15.
 */
@RestController
@RequestMapping("/gsv")
@CrossOrigin
public class GsvInformationController {

    @Autowired
    private GsvInformationService gsvInformationService;

    /**
     * 导入表格
     * @param file
     * @return
     */
    @PostMapping("/import")
    public ResponseResult<Boolean> importData(@RequestParam MultipartFile file){
        System.out.println("读取excel");
        gsvInformationService.readExcel(file);
        return new ResponseResult<>(true);
    }
}
