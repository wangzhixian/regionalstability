package cn.yuchen.bigdate.rs.service.information.service.impl;

import cn.yuchen.bigdate.rs.exception.ArgumentException;
import cn.yuchen.bigdate.rs.service.information.service.GsvInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ExcelUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/15.
 */
@Service
public class GsvInformationServiceImpl implements GsvInformationService {

    @Override
    public Boolean readExcel(MultipartFile file) {
        //检查文件
        ExcelUtils.checkFile(file);
        //获得Workbook工作簿对象
        Workbook wb = ExcelUtils.getWorkBook(file);
        AssertUtils.notNull(wb,"工作簿内容为空");
        //获取所有的工作表的的数量
        int numOfSheet = wb.getNumberOfSheets();
        //遍历这个这些表
        for(int sheetNum = 0; sheetNum < numOfSheet; sheetNum++){
            //获得当前sheet工作表
            Sheet sheet = wb.getSheetAt(sheetNum);
            if(sheet == null){
                continue;
            }
            //获得当前sheet的结束行
            int lastRowNum = sheet.getLastRowNum();

            //遍历所有行
            for (int rowNum = 0; rowNum < 1; rowNum++) {
                //获得当前行
                Row row = sheet.getRow(rowNum);
                if(row == null){
                    continue;
                }
                System.out.println("================"+rowNum+"==================");
                x:for (int i = 0;i<1000;i++) {
                    Cell cell = row.getCell(i);
                    if(Objects.isNull(cell)){
                       continue x;
                    }
                    String stringCellValue = cell.toString();
                    System.out.println(stringCellValue);
                }
                System.out.println("==================================");
            }
        }
        try {
            wb.close();
        } catch (IOException e){
            throw new ArgumentException(e.getMessage());
        }
        return null;
    }
}
