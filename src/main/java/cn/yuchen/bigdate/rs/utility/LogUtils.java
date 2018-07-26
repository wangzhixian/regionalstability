package cn.yuchen.bigdate.rs.utility;

import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wzx on 2018/7/26.
 */
public class LogUtils {

    private static final String URLSTR = "http://192.168.100.22:8080/test/log/add";

    /**
     * 记录操作日志
     * @param sqlSessionFactory         sqlsession工厂
     * @param className                 操作调用接口类名
     * @param methodName                操作调用方法名
     * @param paramName                 参数名
     * @param obj                       操作参数
     */
    public void addOperatedLog(SqlSessionFactory sqlSessionFactory,String className,String methodName,String paramName,Object obj) {
        String records = getExecuteSQL(className, methodName,sqlSessionFactory);
        String properties = paramName+":"+obj.toString();
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("records",records);
        params.put("properties",properties);
        params.put("operatedBy","wzx");
        HttpRequest.post(URLSTR,params);
    }

    /**
     * 获取mybatis运行时执行的sql
     * @param className     调用接口类名
     * @param methodName    调用方法名
     * @return   sql    运行sql
     */
    private String getExecuteSQL(String className,String methodName,SqlSessionFactory sqlSessionFactory) {
        String sqlId = className + "."+ methodName;
        MappedStatement ms = sqlSessionFactory.getConfiguration().getMappedStatement(sqlId);
        String sql = ms.getSqlSource().getBoundSql(0).getSql();
        return sql.replace("\n","");
    }
}
