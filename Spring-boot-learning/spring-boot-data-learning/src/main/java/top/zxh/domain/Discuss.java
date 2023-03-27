package top.zxh.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Date:2023/3/20
 * Author：zxh
 * Description:针对t_comment 的实体类
 */
@Entity(name = "t_comment")
@Data
public class Discuss {

    /**
     * 指定主键自增策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String author;

    private String content;

    @Column(name="a_id")
    private Integer AId;

}
