package top.zxh.controller;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.zxh.Page;
import top.zxh.domain.Discuss;
import top.zxh.repository.DiscussRepository;

import java.util.List;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:
 */
@RestController
@AllArgsConstructor
public class PageTest implements Page {

    private DiscussRepository discussRepository;


    @GetMapping("page")
    List<Discuss> getPage(@RequestParam(value = "id", defaultValue=PAGE_ID )Integer id, @RequestParam(value = "size",defaultValue = PAGE_SIZE)Integer size){

        Pageable pageable = PageRequest.of(id, size);

        List<Discuss> list = discussRepository.getDiscussByPage(pageable);

        return list;

    }
}
