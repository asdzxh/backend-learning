package top.zxh.boot.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.zxh.boot.service.MyService;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/3/14
 * Author：zxh
 * Description:
 */
@SpringBootTest
class MyConfigTest {
    @Autowired
    private MyConfig myConfig;

    @Test
    void mtTest(){
        myConfig.myService().sayHello();
    }

}