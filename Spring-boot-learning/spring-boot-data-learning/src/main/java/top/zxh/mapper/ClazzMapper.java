package top.zxh.mapper;

import top.zxh.domain.Clazz;

/**
 * Date:2023/3/21
 * Author：zxh
 * Description:
 */
public interface ClazzMapper {

    /**
     * 根据班级id查询班级信息：一对多关联查询到班级的所有学生
     * @param clazzId
     * @return
     */
    Clazz selectOneToMany(int clazzId);
}
