package cn.yuchen.bigdate.rs.utility;

import cn.yuchen.bigdate.rs.exception.ArgumentException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/15.
 */
public class ExcelUtils {
    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);
    /**
     * Excel文件后缀
     */
    public static final String SUFFIX_2003 = ".xls";
    public static final String SUFFIX_2007 = ".xlsx";
    /**
     * 电话的正则
     */
    public static final String PHONE_NUMBER_REG = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

    /**
     * 检查文件
     * @param file
     */
    public static void checkFile(MultipartFile file){
        //判断文件是否为空
        if(Objects.isNull(file)){
            log.error("文件为空!");
            throw new ArgumentException("文件为空!");
        }
        //获得文件名
        String fileName = file.getOriginalFilename();
        //判断文件是否是excel文件
        if(!fileName.endsWith(SUFFIX_2003) && !fileName.endsWith(SUFFIX_2007)){
            log.error("文件格式错误，必须为.xls或.xlsx结尾的文件");
            throw new ArgumentException("文件格式错误，必须为.xls或.xlsx结尾的文件");
        }
    }

    //获得文件对象
    public static Workbook getWorkBook(MultipartFile file){
        ////获得文件名
        String fileName = file.getOriginalFilename();
        //创建Workbook工作薄对象，表示整个excel
        Workbook workbook = null;
        try {
            //获取excel文件的io流
            InputStream is = file.getInputStream();
            //根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象
            if(fileName.endsWith(SUFFIX_2003)){
                //2003
                workbook = new HSSFWorkbook(is);
            }else if(fileName.endsWith(SUFFIX_2007)){
                //2007
                workbook = new XSSFWorkbook(is);
            }
        } catch (Exception e) {
            throw new ArgumentException("文件格式错误，必须为.xls或.xlsx结尾的文件");
        }
        return workbook;
    }
}
