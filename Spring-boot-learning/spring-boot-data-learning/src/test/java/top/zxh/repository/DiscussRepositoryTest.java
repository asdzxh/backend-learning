package top.zxh.repository;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import top.zxh.domain.Discuss;

import java.util.List;
import java.util.Optional;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:
 */

@SpringBootTest
class DiscussRepositoryTest {

    @Resource
    private DiscussRepository discussRepository;




    /**
     * 使用 JpaRepository 自带的方法测试
     */
    @Test
    void selectComment(){
        Optional<Discuss> optional = discussRepository.findById(1);
        optional.ifPresent(System.out::println);


//        boolean present = optional.isPresent();
//        if (present){
//            Discuss discuss = optional.get();
//            System.out.println(discuss);
//        }


    }

    @Test
    void findByAuthorNotNull() {

        List<Discuss> list = discussRepository.findByAuthorNotNull();
        list.forEach(System.out::println);
    }

    /**
     * 根据姓名查询
     */
    @Test
    void findByAIdEqualsAndAuthor(){
        List<Discuss> name = discussRepository.findByAuthorEquals("张三");
        name.forEach(System.out::println);
    }

    /**
     * 根据id查询
     */
    @Test
    void findByIdEquals(){
        List<Discuss> id = discussRepository.findByIdEquals(1);
        id.forEach(System.out::println);
    }


    /**
     * 根据AId查询
     *
     *
     *   使用 JpaRepository 方法名关键字进行查询
     *
     */
    @Test
    void findByAIdEquals(){
        List<Discuss> id = discussRepository.findByAIdEquals(1);
        id.forEach(System.out::println);
    }


    /**
     * 分页
     */
    @Test
    void getDiscussByPage(){
        Pageable pageable = PageRequest.of(0, 2);

        List<Discuss> list = discussRepository.getDiscussByPage(pageable);

        list.forEach(System.out::println);
    }

    /**
     * 使用Example 封装参数进行数据查询操作
     */
    void selectCommentByExample(){
        Discuss discuss = new Discuss();
        discuss.setAuthor("张三");
        Example<Discuss> example = Example.of(discuss);
        List<Discuss> list = discussRepository.findAll(example);
        System.out.println(list);
    }








}