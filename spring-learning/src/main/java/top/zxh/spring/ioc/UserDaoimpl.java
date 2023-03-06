package top.zxh.spring.ioc;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class UserDaoimpl implements UserDao{

    @Override
    public void say() {
        System.out.println("Hello world");
    }
}
