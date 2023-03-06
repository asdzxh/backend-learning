package top.zxh.spring.ioc.instance.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zxh.spring.ioc.instance.contructor.Bean1;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description: InstanceTest1
 */
public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans1.xml");
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println(bean1);
    }
}
