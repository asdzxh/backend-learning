package top.zxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zxh.entity.User;

/**
 * Date:2023/3/7
 * Author：zxh
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UMLMappingController {

    @GetMapping("/s")
    @ResponseBody
    public String login(String username){
        System.out.println(username);
        return "this is get method";
    }

    @GetMapping("/u")
    public String login(User user, Model model){

        System.out.println(user);
        model.addAttribute("user",user);
        return "/success";
    }


}
