package top.zxh.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

    private Integer teacherId;

    private String teacherName;

    private Integer clazzId;

    /**
     * 教师管理的班级对象：一对一
     */
    private Clazz clazz;

}
