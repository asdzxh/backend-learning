package top.zxh.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description: setter属性依赖注入测试
 */
public class SetterDITest {
    public static void main(String[] args) {
        //1.配置文件路径
        String xmlPath ="/applicationContext.xml";
        //2.创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        //3.读取配置好的Bean
        UserService userService = (UserService) ac.getBean("userService");
        userService.say();
    }

}
