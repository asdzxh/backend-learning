package top.zxh.exception.service;

import org.springframework.stereotype.Service;
import top.zxh.exception.consts.MsgConsts;
import top.zxh.exception.domain.Article;
import top.zxh.exception.enums.CustomExceptionType;
import top.zxh.exception.exception.CustomException;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Date:2023/3/28
 * Author：zxh
 * Description:
 */
@Service
public class ExceptionService {
//    /**
//     * 服务层，模拟系统异常
//     */
//    public void systemBizError(){
//       throw new CustomException(CustomExceptionType.SYSTEM_ERROR,MsgConsts.SYSTEM_ERROR);
//    }
//
//
//    public void userBizError(int input){
//        //模拟业务校验失败逻辑
//
//        if (input < 0){
//            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, MsgConsts.INPUT_ERROR);
//        }
//    }


    public void authError(){
        throw  new CustomException(CustomExceptionType.UNAUTHORIZED_ERROR);
    }
    public Article getArticle(int id){
        if(id<=0|| id>3){
            throw new CustomException(CustomExceptionType.PARAM_ERROR);
        }
        return findArticleById(id);
    }
    private Article findArticleById(int id){
        List<Article> articles= List.of(new Article(1,"Spring从入门到精通","qwe","spring@qq.com", LocalDateTime.of(2023,3,20,12,12,12)),
                new Article(2,"SpringBoot 从入门到精通","asd","springboot@qq.com",LocalDateTime.of(2023,3,23,12,12,12)),
                new Article(3,"SpringCloud 从入门到精通","学神","springcloud@qq.com",LocalDateTime.of(2023,3,23,12,12,12)));
        return articles.stream().filter(article -> article.getId()==id).toList().get(0);

    }

}
