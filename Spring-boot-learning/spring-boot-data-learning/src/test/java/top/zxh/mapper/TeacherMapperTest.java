package top.zxh.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.zxh.domain.Teacher;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */
@SpringBootTest
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void selectOneByOne() {
        Teacher teacher = teacherMapper.selectOneByOne(1);
        System.out.println(teacher);


    }
}