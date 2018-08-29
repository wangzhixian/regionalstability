package cn.yuchen.bigdate.rs.service.information.service;

import cn.yuchen.bigdate.rs.service.information.pojo.po.GtdPo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.GtdPage;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.util.List;

/**
 * Created by wzx on 2018/8/15.
 */
public interface GtdInformationService {
    /**
     * 读取excel
     * @return
     */
    Boolean readExcel(MultipartFile file) throws ParseException;


    List<GtdPo> findByPage(GtdPage gtdPage);
}
