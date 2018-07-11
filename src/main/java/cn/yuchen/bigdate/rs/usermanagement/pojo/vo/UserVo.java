package cn.yuchen.bigdate.rs.usermanagement.pojo.vo;

/**
 * 用户
 */
public class UserVo {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String  userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 用户描述
     */
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
