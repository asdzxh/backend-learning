package top.zxh.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Date:2023/3/27
 * Author：zxh
 * Description:
 */
//@Configuration
public class FilterRegistration {

    @Bean
    public FilterRegistrationBean<?> filterRegistrationNBean(){
        FilterRegistrationBean<CustomFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CustomFilter());
        //设置拦截路径
        registration.addUrlPatterns("/*");
        registration.setOrder(10);
        return registration;

    }
}
