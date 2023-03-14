package top.zxh.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.zxh.boot.service.MyService;

/**
 * Date:2023/3/14
 * Author：zxh
 * Description:使用@Configuration 编写自定义配置类
 */

@Configuration

public class MyConfig {


    /**
     *     将该方法的返回值，作为一个Bean，添加到Spring容器中,该Bean的id就是方法名
     * @return MyService实例
     */
    @Bean
    public MyService myService(){
        return new MyService();
    }
}
