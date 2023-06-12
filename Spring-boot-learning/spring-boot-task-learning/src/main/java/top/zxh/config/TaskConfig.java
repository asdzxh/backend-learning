package top.zxh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Date:2023/4/4
 * Author：zxh
 * Description:
 */
@Configuration
public class TaskConfig {

    @Bean
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //核心线程数
        executor.setCorePoolSize(12);
        //最大线程数
        executor.setMaxPoolSize(26);
        //缓冲队列
        executor.setQueueCapacity(200);
        //允许线程的时间，到时间后会销毁
        executor.setKeepAliveSeconds(120);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        //设置线程池中任务的等待时间，如果超过这个时间还没销毁就强制销毁，以确保应用最后能被关闭，而不是阻塞住
        executor.setAwaitTerminationSeconds(180);
        //
        executor.setThreadNamePrefix("taskExecutor-");
        //拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return executor;

    }

}
