package top.zxh.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Date:2023/3/14
 * Author：zxh
 * Description:Person
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {

    private Integer id;

    private String name;

    private List<String> hobby;

    private String[] family;

    private Map map;

    private Pet pet;
}
