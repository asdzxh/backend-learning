package top.zxh.spring.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zxh.spring.ioc.instance.factory.Bean3;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans4.xml");
        System.out.println(context.getBean("scope"));
        System.out.println(context.getBean("scope"));

    }
}
