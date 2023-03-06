package top.zxh.spring.ioc.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        String xmlPath= "/beans5.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
    }

}
