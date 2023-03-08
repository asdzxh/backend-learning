package top.zxh.entity;

/**
 * Date:2023/3/7
 * Author：zxh
 * Description:
 */
public class User {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
}