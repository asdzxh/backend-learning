package top.zxh.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Date:2023/3/8
 * Author：zxh
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FreeMarker {
    private String url;
    private String name;
    private String content;
}
