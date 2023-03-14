package top.zxh.boot.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/3/14
 * Author：zxh
 * Description:
 */
@SpringBootTest
class StudentTest {
    @Autowired
    private Student student;

    @Test
    void testStudent(){
        System.out.println(student);
    }

}