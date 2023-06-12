package top.zxh.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Date:2023/4/17
 * Author：zxh
 * Description:
 */
@Controller
@Slf4j
@EnableScheduling
public class SseController {

    @RequestMapping(value = "/sse/msg", method = RequestMethod.GET, produces = "text/event-stream;charset=UTF-8")
    @Scheduled(fixedDelay = 2000)
    public ResponseBodyEmitter pushing() {
        SseEmitter emitter = new SseEmitter(0L);

        Random random = new Random();
        DecimalFormat df = new DecimalFormat( "0.00" );
        Double a = random.nextDouble(1,20);
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String msg =formatter.format(date)+"  "+df.format(a);
        log.info(msg);
        try {
            emitter.send(msg, MediaType.TEXT_EVENT_STREAM);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return emitter;

    }
}
