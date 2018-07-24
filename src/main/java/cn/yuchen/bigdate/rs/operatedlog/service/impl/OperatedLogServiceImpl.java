package cn.yuchen.bigdate.rs.operatedlog.service.impl;

import cn.yuchen.bigdate.rs.operatedlog.dao.OperatedLogDao;
import cn.yuchen.bigdate.rs.operatedlog.pojo.po.OperatedLogPo;
import cn.yuchen.bigdate.rs.operatedlog.pojo.vo.OperatedLogVo;
import cn.yuchen.bigdate.rs.operatedlog.service.OperatedLogService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzx on 2018/7/24.
 */
@Service
public class OperatedLogServiceImpl implements OperatedLogService {

    @Autowired
    private OperatedLogDao operatedLogDao;



    @Override
    public List<OperatedLogVo> findOperatedLogVoByPage() {
        List<OperatedLogPo> operatedLogPos = operatedLogDao.selectByPage();
        List<OperatedLogVo> vos = new ArrayList<>(operatedLogPos.size());
        operatedLogPos.forEach(operatedLogPo -> {
            OperatedLogVo vo = new OperatedLogVo();
            BeanUtils.copyProperties(operatedLogPo,vo);
            vos.add(vo);
        });
        return vos;
    }


    @Override
    public int add(OperatedLogVo operatedLogVo) {
        AssertUtils.notNull(operatedLogVo,"要添加的日志对象不能为空。");
        AssertUtils.hasText(operatedLogVo.getOperatedBy(),"操作用户不能为空。");
        AssertUtils.hasText(operatedLogVo.getRecords(),"操作sql不能为空。");
        OperatedLogPo po = new OperatedLogPo();
        BeanUtils.copyProperties(operatedLogVo,po);
        return operatedLogDao.insert(po);
    }
}
