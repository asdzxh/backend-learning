package top.zxh.exception.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import top.zxh.exception.auth.CheckAuth;
import top.zxh.exception.domain.Article;
import top.zxh.exception.service.ExceptionService;
import top.zxh.exception.util.AjaxResponse;

import java.util.List;

/**
 * Date:2023/3/28
 * Author：zxh
 * Description:
 */
@RestController
@RequestMapping(value = "api")
public class TestController {

//    @Resource
//    private ExceptionService exceptionService;
//
//    @GetMapping("/articles/{id}")
//    public AjaxResponse getArticle(@PathVariable("id") int id) {
//        if (id > 3) {
//            exceptionService.systemBizError();
//        } else if (id < 0) {
//            exceptionService.userBizError(-1);
//        }
//        return AjaxResponse.success(findArticleById(id));
//    }
//
//
//    private Article findArticleById(int id) {
//        List<Article> articles = List.of(new Article(1, "Spring入门", "aaa"),
//                                        new Article(2, "Spring中级", "bbb"),
//                                        new Article(3, "Spring高级", "ccc"));
//
//        return articles.stream().filter(article -> article.getId() == id).toList().get(0);
//    }

    @Resource
    private ExceptionService exceptionService;
    @GetMapping("/articles/{id}")
//    @CheckAuth(value = "Admin123")
    public AjaxResponse getArticle(@PathVariable("id") int id){
        return    AjaxResponse.success(exceptionService.getArticle(id));
    }
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@Valid @RequestBody Article article){
        return AjaxResponse.success(article);
    }

}
