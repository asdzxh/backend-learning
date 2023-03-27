package top.zxh.mapper;

import top.zxh.domain.Teacher;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */


public interface TeacherMapper {

    /**
     * 一对一查询
     * @param teacherId 教师id
     * @return
     */
    Teacher selectOneByOne(int teacherId);
}
