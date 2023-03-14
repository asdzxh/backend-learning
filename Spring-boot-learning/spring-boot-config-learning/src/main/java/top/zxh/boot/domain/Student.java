package top.zxh.boot.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Date:2023/3/14
 * Author：zxh
 * Description:
 * @Component 注解：把Student 类的实例作为Bean 注入到Spring容器中
 */
@Component
//@Data
public class Student {
    @Value("${student.name}")
    private String name;

    @Value("#{5*6}")
    private Integer id;



    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", id=" + id +
               '}';
    }
}
