package top.zxh.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:
 */

@Entity(name = "t_article")
@Data
public class Article {


    /**
     * 指定主键自增策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String title;

    private String content;

    private String image;
}
