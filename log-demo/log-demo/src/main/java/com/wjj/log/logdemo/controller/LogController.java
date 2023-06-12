package com.wjj.log.logdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :wjj
 * @date : 2023/4/3
 * @Description :
 */
@RestController
@Slf4j
public class LogController {

    @GetMapping("/logs")
    public void getLogs(){
        log.trace("Trace 日志");
        log.debug("Debug 日志");
        log.info("Info 日志");
        log.warn("warn 日志");
        log.error("Error 日志");
    }

}
