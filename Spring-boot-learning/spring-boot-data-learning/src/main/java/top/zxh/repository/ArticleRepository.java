package top.zxh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.zxh.domain.Article;

import java.util.List;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:
 */
public interface ArticleRepository extends JpaRepository<Article,Integer> {


}
