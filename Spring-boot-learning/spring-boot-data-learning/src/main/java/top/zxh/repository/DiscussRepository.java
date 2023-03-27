package top.zxh.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import top.zxh.domain.Discuss;

import java.util.List;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:
 */
public interface DiscussRepository extends JpaRepository<Discuss,Integer> {


    /**
     *  查询author 非空的 Discuss 评论集合
     * @return
     */
    List<Discuss> findByAuthorNotNull();

    /**
     * 根据姓名查询
     * @param author
     * @return
     */
    List<Discuss> findByAuthorEquals(String author);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    List<Discuss> findByIdEquals(Integer id);


    /**
     * 根据 aId
     * @param a_id
     * @return
     */
    List<Discuss> findByAIdEquals(Integer a_id);


    @Query("SELECT c FROM t_comment c ")
    List<Discuss> getDiscussByPage(Pageable pageable);






}
