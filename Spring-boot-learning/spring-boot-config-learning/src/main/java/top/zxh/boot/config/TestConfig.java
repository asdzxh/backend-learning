package top.zxh.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements DBConfig{
    @Override
    public String configure() {
        return "test configure";
    }
}
