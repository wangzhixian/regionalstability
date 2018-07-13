package cn.yuchen.bigdate.rs.exception;

/**
 * 参数异常类
 */
public class ArgumentException extends RSException{

    public ArgumentException() {
    }

    public ArgumentException(String message) {
        super(message,new IllegalArgumentException(message));
    }

    public ArgumentException(Throwable cause) {
        super(cause);
    }
}
