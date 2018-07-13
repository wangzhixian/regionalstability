package cn.yuchen.bigdate.rs.exception;

import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.utility.RestResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.lang.reflect.InvocationTargetException;

/**
 * 全局异常处理类
 * Created by wzx on 2018/7/13.
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseResult<String> handleException(Exception e){
        log.error("系统抛出exception异常：{}",e);
        return new ResponseResult<>(RestResultEnum.UNKNOWN_ERROR,"系统异常，请联系管理员。");
    }

    @ExceptionHandler(ArgumentException.class)
    public ResponseResult<String> handleArgumentException(ArgumentException a){
        return new ResponseResult<>(RestResultEnum.ARGUMENT_ERROR,a.getMessage());
    }

    @ExceptionHandler(RSException.class)
    public ResponseResult<String> handleRSException(RSException r){
        log.error("系统抛出RSException异常：{}",r);
        return new ResponseResult<>(RestResultEnum.UNKNOWN_ERROR,r.getMessage());
    }

    @ExceptionHandler( {InvocationTargetException.class,IllegalAccessException.class})
    public ResponseResult<String> handleIllException(InvocationTargetException i,IllegalAccessException ill){
        log.error("对象复制异常：InvocationTargetException:{},IllegalAccessException:{}",i,ill);
        return new ResponseResult<>(RestResultEnum.ERROR,"对象复制异常");
    }

}
