package top.zxh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Date:2023/4/18
 * Author：zxh
 * Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    Integer id;
    String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date time;
}
