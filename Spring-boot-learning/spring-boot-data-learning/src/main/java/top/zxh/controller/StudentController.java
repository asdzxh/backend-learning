package top.zxh.controller;

import jakarta.annotation.Resource;
import top.zxh.domain.Clazz;
import top.zxh.domain.Student;
import top.zxh.mapper.ClazzMapper;
import top.zxh.mapper.StudentMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller

public class StudentController {


    @Resource
    private StudentMapper studentMapper;


    @Resource
    private ClazzMapper clazzMapper;

    @RequestMapping("/student")
    @ResponseBody
    public Student test(){
        Student student = studentMapper.getStudent(1001);
//        Clazz clazz = clazzMapper.selectOneToMany( student.getClazz().getClazzId());
//        student.getClazz().setStudents(clazz.getStudents());

        return student;
    }
}
