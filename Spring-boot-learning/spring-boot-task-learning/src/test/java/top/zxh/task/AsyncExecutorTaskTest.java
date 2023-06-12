package top.zxh.task;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:
 */
@SpringBootTest
class AsyncExecutorTaskTest {
    @Resource
    private AsyncExecutorTask task;

    @Test
    void testAsyncExcutorTask() throws InterruptedException {
        task.doTaskOneCallBack();
        task.doTaskTwoCallBack();
        task.doTaskThreeCallBack();
        sleep(10*1000L);
    }



}