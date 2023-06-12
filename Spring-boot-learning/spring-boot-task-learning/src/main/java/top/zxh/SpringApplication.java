package top.zxh;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Date:${DATE}
 * Author：zxh
 * Description:
 */
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class SpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class,args);
    }
}