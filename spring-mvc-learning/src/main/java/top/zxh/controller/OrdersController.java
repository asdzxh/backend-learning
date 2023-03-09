package top.zxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import top.zxh.entity.Orders;
import top.zxh.entity.User;

/**
 * Date:2023/3/9
 * Author：zxh
 * Description: 订单控制器类
 */
@Controller
public class OrdersController {
    /*
    订单查询页面跳转
     */
    @GetMapping("/toFindOrderUser")
    public String toFindOrderswithUser(){
        return "orders";
    }

    /**
     * 查询订单和用户信息
     */
    @GetMapping("/findOrderUser")
    public String findOrderWithUser(Orders orders){
        Integer orderId = orders.getOrderId();
        User user = orders.getUser();
        String name = user.getName();
        System.out.println(orderId);
        System.out.println(name);


        return "success2";
    }

}
