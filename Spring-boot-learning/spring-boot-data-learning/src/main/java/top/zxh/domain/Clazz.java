package top.zxh.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Clazz {

    private Integer clazzId;

    private String clazzName;

    private Integer teacherId;


    private List<Student> students;



}
