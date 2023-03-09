package top.zxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Date:2023/3/9
 * Author：zxh
 * Description:日期控制类
 */
@Controller
public class DateController {
    /**
     * 使用自定义类型数据绑定日期数据
     */
    @RequestMapping("/customDate")
    @ResponseBody
    public String customDate(Date date){
        System.out.println("date="+date);
        return "success";
    }


}
