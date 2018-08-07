package cn.yuchen.bigdate.rs.model.pojo.webvo;

/**
 * Created by wzx on 2018/8/3.
 */
public class ModelMethodParameterVo {

//=========方法======================
    /**
     * 唯一主键
     */
    private Long methodId;
    /**
     * 模型ID（外键）
     */
    private Long modelId;
    /**
     * 方法名称
     */
    private String methodName;
    /**
     * 方法描述
     */
    private String methodScript;

    /**
     * 方法是否显示：0 不显示，1 显示
     */
    private Integer display;
//=========参数======================
    /**
     * 唯一主键
     */
    private Long parameterId;
    /**
     * 关联专家参数结果ID
     */
    private Long xId;
    /**
     * 参数名称
     */
    private String parameterName;
    /**
     * 参数描述
     */
    private String parameterScript;
    /**
     * 参数类型: system 系统 , expert  专家 , personal 个人
     */
    private String parameterCategory;
    /**
     * 参数归属人ID ，0 代表系统
     */
    private Long owerid;

    public Long getMethodId() {
        return methodId;
    }

    public void setMethodId(Long methodId) {
        this.methodId = methodId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodScript() {
        return methodScript;
    }

    public void setMethodScript(String methodScript) {
        this.methodScript = methodScript;
    }

    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    public Long getxId() {
        return xId;
    }

    public void setxId(Long xId) {
        this.xId = xId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterScript() {
        return parameterScript;
    }

    public void setParameterScript(String parameterScript) {
        this.parameterScript = parameterScript;
    }

    public String getParameterCategory() {
        return parameterCategory;
    }

    public void setParameterCategory(String parameterCategory) {
        this.parameterCategory = parameterCategory;
    }

    public Long getOwerid() {
        return owerid;
    }

    public void setOwerid(Long owerid) {
        this.owerid = owerid;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "ModelMethodParameterVo{" +
                "methodId=" + methodId +
                ", modelId=" + modelId +
                ", methodName='" + methodName + '\'' +
                ", methodScript='" + methodScript + '\'' +
                ", display=" + display +
                ", parameterId=" + parameterId +
                ", xId=" + xId +
                ", parameterName='" + parameterName + '\'' +
                ", parameterScript='" + parameterScript + '\'' +
                ", parameterCategory='" + parameterCategory + '\'' +
                ", owerid=" + owerid +
                '}';
    }
}
