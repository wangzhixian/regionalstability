package cn.yuchen.bigdate.rs.utility;


import lombok.Data;

import java.io.Serializable;

/**
 * 标准返回体
 */
@Data
public class ResponseResult<T> implements Serializable {

    /**
     * 状态码
     */
    private int retcode;
    /**
     * 信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public ResponseResult() {
        this.retcode = RestResultEnum.SUCCESS.getKey();
    }

    public ResponseResult(int code, String message) {
        this.retcode = code;
        this.msg = message;
    }

    public ResponseResult(RestResultEnum restResultInfoEnum) {
        this.retcode = restResultInfoEnum.getKey();
        this.msg = restResultInfoEnum.getMessage();
    }


    public ResponseResult(RestResultEnum restResultInfoEnum, T data) {
        this.retcode = restResultInfoEnum.getKey();
        this.msg = restResultInfoEnum.getMessage();
        this.data = data;
    }


    public ResponseResult(T data) {
        this.retcode = RestResultEnum.SUCCESS.getKey();
        this.data = data;
    }
}
