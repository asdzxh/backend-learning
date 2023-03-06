package top.zxh.spring.ioc.iocExercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zxh.spring.ioc.UserService;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class BookTest {
    public static void main(String[] args) {
        //1.配置文件路径
        String xmlPath ="/applicationContext.xml";
        //2.创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        //3.读取配置好的Bean
        Book book2 =  ac.getBean("book2",Book.class);
        System.out.println("无参构造器"+book2);

        Book book =  ac.getBean("book",Book.class);
        System.out.println("带参构造器"+book);


    }




}
