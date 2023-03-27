package top.zxh.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.zxh.domain.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */
@SpringBootTest
class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 多对一
     */
    @Test
    void selectManyToOne() {
        Student student = studentMapper.selectManyToOne(1001);


        assertEquals("钱智康",student.getStudentName());
        System.out.println(student);
    }

    /**
     * 一对多
     */
    @Test
    void selectOneToMany(){
        Student student = studentMapper.selectOneToMany(1001);
        System.out.println(student);
    }

    /**
     * 多对多
     */

    @Test
    void getStudent(){
        Student student = studentMapper.getStudent(1001);
        System.out.println(student);
    }

    /**
     * 批量插入
     */
    @Test
    void batchInsert(){
        List<Student> students = new ArrayList<>();
        for (int i = 0;i<100;i++){
            Student student  =Student.builder()
                    .studentId(3000+i)
                    .clazzId(1)
                    .studentName("测试学生"+i)
                    .hometown("南京")
                    .birthday(LocalDate.of(2003,10,3))
                    .build();
            students.add(student);
        }
        int count = studentMapper.batchInsert(students);
        System.out.println(count);
    }


    /**
     * 批量更新
     */
    @Test
    void batchUpdate(){
        List<Student> students = new ArrayList<>();
        for (int i=0;i<50;i++){
            Student student = Student.builder()
                    .studentId(3000+i)
                    .clazzId(1)
                    .studentName("新名字"+i)
                    .hometown("苏州")
                    .build();
            students.add(student);
        }
        int count = studentMapper.batchUpdate(students);
        System.out.println(count);
    }

    /**
     * 批量删除
     */
    @Test
    void batchDelete(){
        List<Integer> idList = List.of(3000,3001,3002,3003);
        int count = studentMapper.batchDelete(idList);
        System.out.println(count);
    }

    /**
     * 动态查询
     */
    @Test
    void dynamicSelect(){
        Student student = Student.builder()
                .hometown("州")
                .build();
        List<Student> students = studentMapper.dynamicSelect(student);
        students.forEach(s -> {
            System.out.println(s.getClazzId()+","+s.getStudentName()+","+s.getHometown()+","+s.getBirthday());
        });
    }

    /**
     * 根据id查找学生
     */
    @Test
    void findById(){
        Student student = studentMapper.findById(1001);
        System.out.println(student);
    }

    /**
     * 新增学生
     */
    @Test
    void insert(){

        Student student = Student.builder()
                .clazzId(1)
                .studentName("张三")
                .hometown("扬州")
                .birthday(LocalDate.of(2022,12,12))
                .build();
        int insert = studentMapper.insert(student);
        System.out.println(insert);

    }

    /**
     * 修改学生信息
     */
    @Test
    void update(){
        Student student = Student.builder()
                .studentId(3100)
                .studentName("李四")
                .hometown("泰州")
                .clazzId(2)
                .build();
        int update = studentMapper.update(student);
        System.out.println(update);
    }

    /**
     * 删除学生
     */
    @Test
    void delete(){
        int i = studentMapper.deleteById(3100);
        System.out.println(i);
    }
}