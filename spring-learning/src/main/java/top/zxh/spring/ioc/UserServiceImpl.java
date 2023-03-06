package top.zxh.spring.ioc;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    private String message;


    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("userService say hello world");
    }

    public void setMessage(String message){
        this.message = message;
        System.out.println(message);
    }
}
