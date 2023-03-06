package top.zxh.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
@Controller("userController")
public class UserController {
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private UserService userService;

    public void  save(){
        this.userService.save();
        System.out.println("userController...save...");
    }
}
