package top.zxh.boot.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.zxh.boot.prop.MyProperties;

/**
 * Date:2023/3/14
 * Author：zxh
 * Description:
 */
@SpringBootTest
class MyPropertiesTest {
    @Autowired
    private MyProperties myProperties;


    @Test
    void myTst(){
        System.out.println(myProperties);
    }

}