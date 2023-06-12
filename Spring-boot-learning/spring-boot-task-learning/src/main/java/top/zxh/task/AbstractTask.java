package top.zxh.task;

import lombok.extern.slf4j.Slf4j;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:任务抽象类
 */
@Slf4j
public class AbstractTask {

    public void doTaskOne() throws InterruptedException{
        log.info("开始做任务一");
        //执行耗时任务
        long start = currentTimeMillis();
        sleep(10000);
        long end = currentTimeMillis();
        log.info("完成任务一，耗时："+(end-start)+"毫秒");
    }

    public void doTaskTwo() throws InterruptedException{
        log.info("开始做任务二");
        //执行耗时任务
        long start = currentTimeMillis();
        sleep(5000);
        long end = currentTimeMillis();
        log.info("完成任务二，耗时："+(end-start)+"毫秒");
    }

    public void doTaskThree() throws InterruptedException{
        log.info("开始做任务三");
        //执行耗时任务
        long start = currentTimeMillis();
        sleep(3000);
        long end = currentTimeMillis();
        log.info("完成任务三，耗时："+(end-start)+"毫秒");
    }

}
