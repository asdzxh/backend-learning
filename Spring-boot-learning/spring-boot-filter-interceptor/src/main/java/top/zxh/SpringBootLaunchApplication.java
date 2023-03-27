package top.zxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import top.zxh.event.MyEvent;
import top.zxh.event.MyListener1;

/**
 * Date:${DATE}
 * Author：zxh
 * Description:
 */
@SpringBootApplication
@ServletComponentScan
public class SpringBootLaunchApplication {
    public static void main(String[] args) {
//        SpringApplication.run(SpringBootLaunchApplication.class,args);

        //获取ConfigurableApplicationContext上下文
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootLaunchApplication.class,args);

        //装载监听
        context.addApplicationListener(new MyListener1());
        //发布事件
        context.publishEvent(new MyEvent("测试事件"));

    }
}