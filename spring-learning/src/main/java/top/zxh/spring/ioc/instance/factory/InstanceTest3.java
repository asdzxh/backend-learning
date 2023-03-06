package top.zxh.spring.ioc.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans3.xml");
        Bean3 bean3 = context.getBean("bean3", Bean3.class);
        System.out.println(bean3);
    }

}
