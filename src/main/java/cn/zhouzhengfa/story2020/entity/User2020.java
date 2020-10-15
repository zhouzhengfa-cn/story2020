package cn.zhouzhengfa.story2020.entity;

/**
 * @author zhouzhengfa-china-2020
 * table-name:user2020
 */
public class User2020 {
    /**
     * 表结构里主键
     */
    private int id;
    /**
     * 用户名称，
     */
    private String name;

    /**
     * 电子邮件，注册使用，
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    public User2020() {
    }

    public User2020(String name, String email) {
        this.name = name;
        this.email = email;
        password="111111";
    }

    public User2020(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User2020(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
