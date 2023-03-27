package top.zxh.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.zxh.domain.Clazz;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */
@SpringBootTest
class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void selectOneToMany() {
        Clazz clazz = clazzMapper.selectOneToMany(1);
        System.out.println(clazz);


    }
}