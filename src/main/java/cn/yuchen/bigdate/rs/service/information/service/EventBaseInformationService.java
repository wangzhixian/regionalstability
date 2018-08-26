package cn.yuchen.bigdate.rs.service.information.service;

import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;

/**
 * Created by wzx on 2018/8/24.
 */
public interface EventBaseInformationService {

    int add(EventBasePoWithBLOBs eventBasePoWithBLOBs);

    EventBasePoWithBLOBs findByNid(String nid);

    int update(EventBasePoWithBLOBs eventBasePoWithBLOBs);


}
