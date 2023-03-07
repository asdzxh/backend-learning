package top.zxh.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Date:2023/3/7
 * Author：zxh
 * Description:
 */
public class FirstController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //创建一个模型视图对象
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","我的第一个Spring MVC应用");
        mav.addObject("user",new User("zxh","123"));

        //向模型中添加数据
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;

    }
}

class User{
    private String name;
    private String password;

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