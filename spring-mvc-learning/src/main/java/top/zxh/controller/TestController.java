package top.zxh.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Date:2023/3/7
 * Author：zxh
 * Description:
 */
@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello test";
    }


}
