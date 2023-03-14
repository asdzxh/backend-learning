package top.zxh.boot.prop;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Date:2023/3/14
 * Author：zxh
 * Description:
 */
@Configuration //标注本类为配置类
@PropertySource("classpath:my.properties")//指定自定义注解的位置和名称
@ConfigurationProperties(prefix = "my") //指定配置文件的注入属性的前缀
@Setter
@ToString
public class MyProperties {
    private String url;

    private String username;

    private String password;
}
