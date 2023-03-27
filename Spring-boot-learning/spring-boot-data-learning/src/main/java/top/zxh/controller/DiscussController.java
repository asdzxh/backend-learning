package top.zxh.controller;

import jakarta.annotation.Resource;
import jakarta.websocket.server.PathParam;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import top.zxh.domain.Article;
import top.zxh.domain.Discuss;
import top.zxh.repository.ArticleRepository;
import top.zxh.repository.DiscussRepository;

import java.util.List;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:
 */

@Controller
public class DiscussController {

    @Resource
    private DiscussRepository discussRepository;
    @Resource
    private ArticleRepository articleRepository;

    @GetMapping("/discuss")
    public String getDiscuss(ModelMap map){

        Pageable pageable = PageRequest.of(0, 3);
        List<Discuss> list = discussRepository.getDiscussByPage(pageable);

        map.put("discussList",list);
        map.put("title","你好");

        return "index";
    }


    @GetMapping("/discussByAId")
    public String getDiscussAId(ModelMap map, @PathParam(value = "AId")Integer AId){

        List<Discuss> list = discussRepository.findByAIdEquals(AId);

        map.put("discussList",list);

        return "detail";
    }



}
