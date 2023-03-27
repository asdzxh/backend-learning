package top.zxh.repository;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.zxh.domain.Article;

import java.util.List;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:
 */
@SpringBootTest
class ArticleRepositoryTest {

    @Resource
    private ArticleRepository articleRepository;

//    @Test
//    void findByIdNotNull() {
//        List<Article> byIdNotNull = articleRepository.findByTitleNotNull();
//        byIdNotNull.forEach(System.out::println);
//
//    }
}