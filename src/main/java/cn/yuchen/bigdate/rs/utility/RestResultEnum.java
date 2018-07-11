package cn.yuchen.bigdate.rs.utility;

/**
 * 自定义异常枚举类
 * Created by wzx on 2018/7/11.
 */
public enum RestResultEnum {
    SUCCESS(2000000, "操作成功"),
    ERROR(50000000, "操作错误"),
    UNKNOWN_ERROR(-1, "未知异常错误"),
    NOT_FOUND_ERROR(-2, "请求地址不存在"),
    FORBIDDEN_ERROR(-3, "没有相关操作权限"),
    ARGUMENT_ERROR(-4, "请求参数错误");

    private int key;
    private String message;

    RestResultEnum(int key, String message) {
        this.key = key;
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
