package cn.yuchen.bigdate.rs.exception;

/**
 * 区域稳定性 异常基类
 */
public class RSException extends RuntimeException {

    private static final long serialVersionUID = -4488377121094064672L;

    public RSException() {
    }

    public RSException(String message) {
        super(message);
    }

    public RSException(String message, Throwable cause) {
        super(message, cause);
    }

    public RSException(Throwable cause) {
        super(cause);
    }


}
