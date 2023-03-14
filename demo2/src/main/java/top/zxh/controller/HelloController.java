package top.zxh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.zxh.Course;
import top.zxh.CourseTeacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Date:2023/3/13
 * Author：zxh
 * Description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getList")
    @ResponseBody
    public Map lsit(){

        HashMap<String, Object> map = new HashMap<>();
        ArrayList<Course> list = new ArrayList<Course>();
        {
            Course course01 = Course.builder().
                    courseId(1)
                    .courseClass("软件2242 Web2班")
                    .courseName("后端工程开发")
                    .courseNo("2942577")
                    .courseCover("https://public-cdn-oss.mosoteach.cn/mssvc/cover/2023/02/effaea97669cecb86c6b9e9d2dce54cd.jpg?x-oss-process=style/s300x300")
                    .courseTeacher(new CourseTeacher("许莫淇", "https://public-cdn-oss.mosoteach.cn/avatar/2020/01/a2f12c73eed9ee74b87f8f05865a8d3b.jpg?v=1579922683&x-oss-process=style/s300x300"))
                    .semester("2022-2023-2")
                    .finished(true)
                    .show(false)
                    .isRemove(false)
                    .build();
            Course course02 = Course.builder().
                    courseId(2)
                    .courseClass("软件2242 Web2班")
                    .courseName("前端工程开发")
                    .courseNo("2942577")
                    .courseCover("https://public-cdn-oss.mosoteach.cn/mssvc/cover/2023/02/effaea97669cecb86c6b9e9d2dce54cd.jpg?x-oss-process=style/s300x300")
                    .courseTeacher(new CourseTeacher("许莫淇", "https://public-cdn-oss.mosoteach.cn/avatar/2020/01/a2f12c73eed9ee74b87f8f05865a8d3b.jpg?v=1579922683&x-oss-process=style/s300x300"))
                    .semester("2022-2023-2")
                    .finished(true)
                    .show(false)
                    .isRemove(false)
                    .build();
            Course course03 = Course.builder().
                    courseId(3)
                    .courseClass("软件2242 Web2班")
                    .courseName("Web 应用开发")
                    .courseNo("2942577")
                    .courseCover("https://public-cdn-oss.mosoteach.cn/mssvc/cover/2023/02/effaea97669cecb86c6b9e9d2dce54cd.jpg?x-oss-process=style/s300x300")
                    .courseTeacher(new CourseTeacher("许莫淇", "https://public-cdn-oss.mosoteach.cn/avatar/2020/01/a2f12c73eed9ee74b87f8f05865a8d3b.jpg?v=1579922683&x-oss-process=style/s300x300"))
                    .semester("2022-2023-2")
                    .finished(false)
                    .show(false)
                    .isRemove(false)
                    .build();
            Course course04 = Course.builder().
                    courseId(4)
                    .courseClass("软件2242 Web2班")
                    .courseName("Java程序设计")
                    .courseNo("2942577")
                    .courseCover("https://public-cdn-oss.mosoteach.cn/mssvc/cover/2023/02/effaea97669cecb86c6b9e9d2dce54cd.jpg?x-oss-process=style/s300x300")
                    .courseTeacher(new CourseTeacher("许莫淇", "https://public-cdn-oss.mosoteach.cn/avatar/2020/01/a2f12c73eed9ee74b87f8f05865a8d3b.jpg?v=1579922683&x-oss-process=style/s300x300"))
                    .semester("2022-2023-2")
                    .finished(false)
                    .show(false)
                    .isRemove(false)
                    .build();
            list.add(course01);
            list.add(course02);
            list.add(course03);
            list.add(course04);

        }


        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", list);
        return map;

    }


}
