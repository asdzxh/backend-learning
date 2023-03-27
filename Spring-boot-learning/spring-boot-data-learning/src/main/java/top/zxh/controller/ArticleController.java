package top.zxh.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import top.zxh.domain.Article;
import top.zxh.repository.ArticleRepository;

import java.util.List;

/**
 * @ClassName: ArtcicleController
 * @Author: lsc
 * @Date: 2023/03/20/16:21
 */
@Controller
public class ArticleController {
    @Resource
    private ArticleRepository articleRepository;

    @GetMapping("articleList")
    public String articleList(ModelMap map){

        List<Article> list = articleRepository.findAll();
        map.put("articleList",list);

        return "Aindex";
    }
}
