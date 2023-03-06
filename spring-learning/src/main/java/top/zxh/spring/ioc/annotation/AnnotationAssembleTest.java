package top.zxh.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class AnnotationAssembleTest {
    public static void main(String[] args) {
        String xmlPath= "/beans6.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserController userController =(UserController) context.getBean("userController");
        userController.save();
    }


}
