package top.zxh.task;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Future;
import java.util.function.Function;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:
 */
@Slf4j
@SpringBootTest
class AsyncCallBackTaskTest {

    @Resource
    private AsyncCallBackTask asyncCallBackTask;

    @Test
    void testSyncTask() throws InterruptedException {
        long start = currentTimeMillis();
        Future<String> task1= asyncCallBackTask.doTaskOneCallBack();
        Future<String> task2=asyncCallBackTask.doTaskTwoCallBack();
        Future<String> task3=asyncCallBackTask.doTaskThreeCallBack();

        //三个任务都调用完成,退出等待
        while(!task1.isDone() || !task2.isDone() || !task3.isDone()){
            sleep(2000);
        }
        long end = currentTimeMillis();
        log.info("总耗时"+(end-start)+"毫秒");
    }



}