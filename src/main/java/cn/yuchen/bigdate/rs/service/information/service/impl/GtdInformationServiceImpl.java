package cn.yuchen.bigdate.rs.service.information.service.impl;

import cn.yuchen.bigdate.rs.exception.ArgumentException;
import cn.yuchen.bigdate.rs.service.information.dao.GtdDao;
import cn.yuchen.bigdate.rs.service.information.pojo.po.GtdPo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.GtdPage;
import cn.yuchen.bigdate.rs.service.information.service.GtdInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ExcelUtils;
import com.github.pagehelper.PageHelper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/15.
 */
@Service
public class GtdInformationServiceImpl implements GtdInformationService {

    @Autowired
    private GtdDao gtdDao;


    @Override
    public Boolean readExcel(MultipartFile file) throws ParseException {
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
            y:for (int rowNum = 1; rowNum <= lastRowNum; rowNum++) {
                //获得当前行
                Row row = sheet.getRow(rowNum);
                if(row == null){
                    continue;
                }
                //根据eventID查询重复
                GtdPo gtdPo = gtdDao.selectByEventId(ExcelUtils.getCellValue(row.getCell(0)));
                if(Objects.nonNull(gtdPo)){
                    //若重复则不添加
                    continue y;
                }
                //添加前拼接对象
                StringBuffer  time = new  StringBuffer ();
                StringBuffer  strs = new  StringBuffer ();
                x:for (int i = 0;i<130;i++) {
                    Cell cell = row.getCell(i);
                    //获取每列的值
                    String cellValue = ExcelUtils.getCellValue(cell);
                    //时间处理
                    if(i>0 && i<4){
                        Integer t = Integer.valueOf(cellValue);
                        if(t<10){
                            cellValue = "0"+cellValue;
                        }
                        time.append(cellValue);
                        if(i != 3){
                            time.append("-");
                        }
                        continue x;
                    }
                    strs.append(cellValue+"###");//中间用##代替
                }
                //转换时间
                String eventTimeStr = time.toString();
                SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
                Date eventTime = formatter.parse(eventTimeStr);
                //输出拼接的字符串
                String str = strs.toString();
                String[] split = str.split("###");
                GtdPo po = new GtdPo(split[0],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12],split[13],
                        split[14],split[15],split[16],split[17],split[18],split[19],split[20],split[21],split[22],split[23],
                        split[24],split[25],split[26],split[27],split[28],split[29],split[30],split[31],split[32],split[33],
                        split[34],split[35],split[36],split[37],split[38],split[39],split[40],split[41],split[42],split[43],
                        split[44],split[45],split[46],split[47],split[48],split[49],split[50],split[51],split[52],split[53],
                        split[54],split[55],split[56],split[57],split[58],split[59],split[60],split[61],split[62],split[63],
                        split[64],split[65],split[66],split[67],split[68],split[69],split[70],split[71],split[72],split[73],
                        split[74],split[75],split[76],split[77],split[78],split[79],split[80],split[81],split[82],split[83],
                        split[84],split[85],split[86],split[87],split[88],split[89],split[90],split[91],split[92],split[93],
                        split[94],split[95],split[96],split[97],split[98],split[99],split[100],split[101],split[102],split[103],
                        split[104],split[105],split[106],split[108],split[109],split[112],split[113],split[115],split[117],split[118],
                        split[119],split[120]);
                po.setEventTime(eventTime);
                po.setEventName("***");//预留字段暂时设置成***表示空
                //向数据库中添加
                gtdDao.insert(po);
            }
        }
        try {
            wb.close();
        } catch (Exception e){
            throw new ArgumentException(e.getMessage());
        }
        return null;
    }

    @Override
    public List<GtdPo> findByPage(GtdPage gtdPage) {
        if(Objects.isNull(gtdPage)){
            return  new ArrayList<>();
        }
        PageHelper.startPage(gtdPage.getPageNum(),gtdPage.getPageSize());
        return  gtdDao.selectByPage(gtdPage);
    }


}
