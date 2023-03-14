package top.zxh;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    private Integer courseId;
    private String courseClass;
    private String courseName;
    private String courseNo;
    private String courseCover;
    private CourseTeacher courseTeacher;
    private String semester;
    private Boolean finished;
    private Boolean show;
    private Boolean isRemove;
}
