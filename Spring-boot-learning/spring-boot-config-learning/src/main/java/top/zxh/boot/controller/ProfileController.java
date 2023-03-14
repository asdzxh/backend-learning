package top.zxh.boot.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zxh.boot.config.DBConfig;


@RestController
@AllArgsConstructor
public class ProfileController {

    private final DBConfig dbConfig;

    @GetMapping("/show")
    public String show(){
        return dbConfig.configure();
    }
}
