package cn.yuchen.bigdate.rs.exception;

import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.utility.RestResultEnum;
import com.mongodb.MongoCommandException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.SessionException;
import org.apache.solr.client.solrj.SolrServerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.data.mongodb.UncategorizedMongoDbException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

/**
 * 全局异常处理类
 * Created by wzx on 2018/7/13.
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ParseException.class)
    public ResponseResult<String> handleException(ParseException pe){
        log.error("字符串转换异常,请通知管理员。ParseException：{}",pe);
        return new ResponseResult<>(RestResultEnum.INFORMATION_TODATE_ERROR.getKey(),RestResultEnum.INFORMATION_TODATE_ERROR.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseResult<String> handleException(Exception e){
        log.error("未知异常,请通知管理员。Exception：{}",e);
        return new ResponseResult<>(RestResultEnum.UNKNOWN_ERROR.getKey(),RestResultEnum.UNKNOWN_ERROR.getMessage());
    }

    @ExceptionHandler(ArgumentException.class)
    public ResponseResult<String> handleArgumentException(ArgumentException a){
        return new ResponseResult<>(RestResultEnum.ARGUMENT_ERROR,a.getMessage());
    }

    @ExceptionHandler(RSException.class)
    public ResponseResult<String> handleRSException(RSException r){
        log.error("系统异常,RSException：{}",r);
        return new ResponseResult<>(RestResultEnum.UNKNOWN_ERROR,r.getMessage());
    }

    @ExceptionHandler(BeansException.class)
    public ResponseResult<String> handleIllException(BeansException b){
        log.error("对象复制异常：BeansException:{}",b);
        return new ResponseResult<>(RestResultEnum.ERROR,"对象复制异常");
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    public ResponseResult<String> handleBadSqlGrammarException(BadSqlGrammarException sql){
        log.error("sql语句异常：BadSqlGrammarException:{}",sql);
        return new ResponseResult<>(RestResultEnum.ERROR,"sql语句异常，通知开发者。");
    }

    @ExceptionHandler(IOException.class)
    public ResponseResult<String> handleIOException(IOException io){
        log.error("io流异常：IOException:{}",io);
        return new ResponseResult<>(RestResultEnum.ERROR,"io流异常，重新尝试。");
    }

    @ExceptionHandler(SolrServerException.class)
    public ResponseResult<String> handleSolrServerException(SolrServerException solr){
        log.error("solr操作异常：SolrServerException:{}",solr);
        return new ResponseResult<>(RestResultEnum.ERROR,"solr操作异常，通知开发者。");
    }

    @ExceptionHandler({MongoCommandException.class,UncategorizedMongoDbException.class})
    public ResponseResult<String> handleMongoDBException(MongoCommandException mogoc,UncategorizedMongoDbException mogou){
        log.error("操作mongo异常，出现这个一般是mongodb操作权限的问题：MongoCommandException:{},UncategorizedMongoDbException:{}",mogoc,mogou);
        return new ResponseResult<>(RestResultEnum.ERROR,"操作mongo异常，通知开发者。");
    }


    @ExceptionHandler(UnauthorizedException.class)
    public ResponseResult<String> handleUnauthorizedException(UnauthorizedException unauthorized){
        log.info("权限不足,抛出UnauthorizedException:{}",unauthorized);
        return new ResponseResult<>(RestResultEnum.USER_NOT_PERMISSION);
    }

    @ExceptionHandler(UnauthenticatedException.class)
    public ResponseResult<String> handleUnauthenticatedException(UnauthenticatedException unauthenticated){
        log.info("用户未登录异常,抛出UnauthenticatedException:{}",unauthenticated);
        return new ResponseResult<>(RestResultEnum.USER_NOT_LOGIN);
    }

    @ExceptionHandler(SessionException.class)
    public ResponseResult<String> handleSessionException(SessionException sessionException){
        log.info("用户退出异常,抛出sessionException:{}",sessionException);
        return new ResponseResult<>(RestResultEnum.LOGOUT_ERROR);
    }



}
