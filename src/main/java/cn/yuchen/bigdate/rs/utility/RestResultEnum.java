package cn.yuchen.bigdate.rs.utility;

/**
 * 自定义异常枚举类
 */
public enum RestResultEnum {
    SUCCESS(200000, "操作成功"),
    ERROR(905000, "操作错误"),
    UNKNOWN_ERROR(906000, "未知异常错误"),
    NOT_FOUND_ERROR(905010, "请求地址不存在"),
    FORBIDDEN_ERROR(904000, "没有相关操作权限"),
    ARGUMENT_ERROR(100000, "请求参数错误");



    //参数错误说明："100000" 分为三部分：开头固定"10"错误码;中间"00"为模块编号(具体编号后期给说明表);后两位"00"表示具体错误信息码(一般对应RestResultEnum).

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
