package cn.yuchen.bigdate.rs.service.information.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wzx on 2018/8/15.
 */
public interface GsvInformationService {
    /**
     * 读取excel
     * @return
     */
    Boolean readExcel(MultipartFile file);
}
