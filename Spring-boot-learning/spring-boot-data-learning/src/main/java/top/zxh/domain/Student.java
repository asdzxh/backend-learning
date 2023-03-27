package top.zxh.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Integer studentId;

    private Integer clazzId;

    private String studentName;

    private String hometown;

    private LocalDate birthday;

    private Clazz clazz;

    private List<Course> courses;
}
