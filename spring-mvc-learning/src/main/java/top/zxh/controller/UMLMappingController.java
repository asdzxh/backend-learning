package top.zxh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zxh.entity.FreeMarker;
import top.zxh.entity.User;

import java.util.ArrayList;


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
    public String login(String username) {
        System.out.println(username);
        return "this is get method";
    }

    @GetMapping("/u")
    public String login(User user, Model model) {

        System.out.println(user);
        model.addAttribute("user", user);
        return "/success";
    }

    @GetMapping("/q")
    public String questionnaireSurvey(Model model, String name, String course, String[] purpose) {
        model.addAttribute("name", name);
        model.addAttribute("course", course);
        String s = " ";
        for (String a : purpose) {
            s += a + " ";
        }
        model.addAttribute("purpose", s);
        return "/qSuccess";
    }

    @GetMapping("/test")
    public String FreeMarker(Model model){

        ArrayList<Object> list = new ArrayList<>();
        FreeMarker e1 = FreeMarker.builder()
                .url("https://spring.io/img/icons/microservices.svg")
                .name("Microservices")
                .content("Quickly deliver production‑grade features with independently evolvable microservices.")
                .build();
        FreeMarker e2 = FreeMarker.builder()
                .url("https://spring.io/img/icons/reactive.svg")
                .name("Reactive")
                .content("Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.")
                .build();
        FreeMarker e3 = FreeMarker.builder()
                .url("https://spring.io/img/icons/cloud.svg")
                .name("Cloud")
                .content("Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.")
                .build();
        FreeMarker e4 = FreeMarker.builder()
                .url("https://spring.io/img/icons/web-apps.svg")
                .name("Web apps")
                .content("Frameworks for fast, secure, and responsive web applications connected to any data store.")
                .build();
        FreeMarker e5= FreeMarker.builder()
                .url("https://spring.io/img/icons/serverless.svg")
                .name("Serverless")
                .content("The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.")
                .build();
        FreeMarker e6 = FreeMarker.builder()
                .url("https://spring.io/img/icons/event-driven.svg")
                .name("Event Driven")
                .content("Integrate with your enterprise. React to business events. Act on your streaming data in realtime.")
                .build();
        FreeMarker e7 = FreeMarker.builder()
                .url("https://spring.io/img/icons/batch.svg")
                .name("Batch")
                .content("Automated tasks. Offline processing of data at a time to suit you.")
                .build();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);

        model.addAttribute("list",list);

        return "/test";
    }


}
