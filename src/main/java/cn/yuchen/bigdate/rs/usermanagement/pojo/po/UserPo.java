package cn.yuchen.bigdate.rs.usermanagement.pojo.po;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * 用户
 */
public class UserPo implements Serializable {
    /**
     * id
     */
    @Id
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
