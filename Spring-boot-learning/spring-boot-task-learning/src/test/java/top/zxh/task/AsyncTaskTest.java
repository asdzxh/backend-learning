package top.zxh.task;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.System.currentTimeMillis;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:
 */
@Slf4j
@SpringBootTest
class AsyncTaskTest {

    @Resource
    private AsyncTask syncTask;

    @Test
    void testSyncTask() throws InterruptedException {
        long start = currentTimeMillis();
        syncTask.doTaskOne();
        syncTask.doTaskTwo();
        syncTask.doTaskThree();
        long end = currentTimeMillis();
        log.info("总耗时"+(end-start)+"毫秒");
    }

}