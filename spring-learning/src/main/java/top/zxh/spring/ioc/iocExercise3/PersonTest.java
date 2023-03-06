package top.zxh.spring.ioc.iocExercise3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zxh.spring.ioc.iocExercise2.Book;

/**
 * Date:2023/3/6
 * Author：zxh
 * Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        //1.配置文件路径
        String xmlPath ="/applicationContext.xml";
        //2.创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        //3.读取配置好的Bean
        Person girl = ac.getBean("girl", Person.class);
        System.out.println(girl);


    }
}
