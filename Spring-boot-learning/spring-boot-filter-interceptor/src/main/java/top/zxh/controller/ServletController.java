package top.zxh.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Date:2023/3/27
 * Author：zxh
 * Description:
 */
@RestController
@RequestMapping("api")
public class ServletController {

    @GetMapping("request")
    public void testRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        request.setAttribute("author","zxh");
        request.setAttribute("author","李四");
        request.removeAttribute("author");

    }
}
