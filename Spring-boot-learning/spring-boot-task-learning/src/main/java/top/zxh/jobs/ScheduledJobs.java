package top.zxh.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description: 定时任务作业
 */
@Component
@Slf4j
public class ScheduledJobs {

//    //表示方法执行完5秒后，继续执行
//    @Scheduled(fixedDelay = 5000)
//    private void fixedDelayJobs() throws InterruptedException {
//        log.info("fixedDelay 开始：---->"+LocalDateTime.now());
//        sleep(10*1000);
//        log.info("fixedDelay 结束：---->"+LocalDateTime.now());
//
//
//    }

    //每隔 3秒
//    @Scheduled(fixedRate = 10000)
//    public void fixedRateJob() throws InterruptedException {
//        log.info("fixedRate 开始：---->"+LocalDateTime.now());
//        sleep(5*1000);
//        log.info("fixedRate 结束：---->"+LocalDateTime.now());
//    }

    @Scheduled(cron = "30 13 15 4 4 ?")
    public void cronJob()  {
        log.info("生日快乐");

    }


}
