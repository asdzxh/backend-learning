package top.zxh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date:2023/3/13
 * Author：zxh
 * Description:
 */
@RestController
public class HelloController {

    @GetMapping("/u")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
