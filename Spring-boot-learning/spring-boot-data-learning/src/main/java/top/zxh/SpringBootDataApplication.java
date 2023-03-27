package top.zxh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Date:${DATE}
 * Author：zxh
 * Description:
 */
@SpringBootApplication
@MapperScan("top.zxh.mapper")
public class SpringBootDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataApplication.class);
    }
}