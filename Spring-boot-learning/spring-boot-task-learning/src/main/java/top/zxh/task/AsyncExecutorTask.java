package top.zxh.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:用线程池调度任务
 */
@Component
@Slf4j
public class AsyncExecutorTask extends AbstractTask{



    @Async("taskExecutor")
    public Future<String> doTaskOneCallBack() throws InterruptedException {
        super.doTaskOne();
        log.info("任务一，当前线程"+Thread.currentThread().getName());
        return new AsyncResult<>("任务一完成");
    }


    @Async("taskExecutor")
    public Future<String> doTaskTwoCallBack() throws InterruptedException {
        super.doTaskTwo();
        log.info("任务二，当前线程"+Thread.currentThread().getName());

        return new AsyncResult<>("任务二完成");
    }


    @Async("taskExecutor")
    public Future<String> doTaskThreeCallBack() throws InterruptedException {
        super.doTaskThree();
        log.info("任务三，当前线程"+Thread.currentThread().getName());
        return new AsyncResult<>("任务三完成");
    }

}
