package top.zxh.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:异步调用任务子类
 */
@Component
public class AsyncTask  extends AbstractTask{
    @Override
    @Async
    public void doTaskOne() throws InterruptedException {
        super.doTaskOne();
    }

    @Override
    @Async
    public void doTaskTwo() throws InterruptedException {
        super.doTaskTwo();
    }

    @Override
    @Async
    public void doTaskThree() throws InterruptedException {
        super.doTaskThree();
    }
}
