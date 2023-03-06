package top.zxh.spring.ioc.iocExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zxh.spring.ioc.UserService;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        //1.配置文件路径
        String xmlPath ="/applicationContext.xml";
        //2.创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        //3.读取配置好的Bean
        Cat cat = (Cat)ac.getBean("cat");
        System.out.println(cat);
        Dog dog = (Dog) ac.getBean("dog");
        System.out.println(dog);
    }
}
