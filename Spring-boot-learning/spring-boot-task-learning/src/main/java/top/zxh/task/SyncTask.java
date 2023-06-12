package top.zxh.task;

import org.springframework.stereotype.Component;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:同步任务调用子类
 */
@Component
public class SyncTask extends AbstractTask{
    @Override
    public void doTaskOne() throws InterruptedException {
        super.doTaskOne();
    }

    @Override
    public void doTaskTwo() throws InterruptedException {
        super.doTaskTwo();
    }

    @Override
    public void doTaskThree() throws InterruptedException {
        super.doTaskThree();
    }
}
