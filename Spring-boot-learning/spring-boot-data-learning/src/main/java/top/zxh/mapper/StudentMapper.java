package top.zxh.mapper;

import org.apache.ibatis.annotations.*;
import top.zxh.domain.Student;

import java.util.List;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */
public interface StudentMapper {

    /**
     * 根据学生id查询学生信息：多对一查询学生所属班级的信息
     *
     * @param studentId
     * @return 学生对象
     */
    Student selectManyToOne(int studentId);

    /**
     * 多对多，根据学生id，查询学生选课情况
     */
    Student selectOneToMany(int id);

    /**
     * 多对多，查询学生所有信息
     */
    Student getStudent(int id);

    /**
     * 批量插入学生信息
     *
     * @param students
     * @return
     */
    int batchInsert(@Param("students") List<Student> students);

    /**
     * 批量修改学生信息
     *
     * @param students
     * @return
     */
    int batchUpdate(@Param("students") List<Student> students);

    /**
     * 批量删除学生
     *
     * @param idList
     * @return
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 动态 SQL查询
     *
     * @param student
     * @return
     */
    List<Student> dynamicSelect(Student student);

    /**
     * 根据学生id查询
     *
     * @param studentId
     * @return
     */
    @Select("SELECT * FROM t_student WHERE student_id = #{studentId}")
    Student findById(int studentId);

    /**
     * 新增学生
     *
     * @param student
     * @return
     */
    @Insert("INSERT INTO t_student(clazz_id, student_name, hometown, birthday) VALUES (#{clazzId},#{studentName},#{hometown},#{birthday})")
    int insert(Student student);

    /**
     * 修改学生信息
     *
     * @param student
     * @return
     */
    @Update("UPDATE t_student SET clazz_id = #{clazzId},student_name =#{studentName},hometown = #{hometown},birthday = #{birthday} WHERE student_id = #{studentId}")
    int update(Student student);

    /**
     * 根据id删除学生
     * @param studentId
     * @return
     */
    @Delete("DELETE FROM t_student WHERE  student_id = #{studentId}")
    int deleteById(int studentId);




}
