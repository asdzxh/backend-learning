package top.zxh.config;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.zxh.interceptor.AuthInterceptor;
import top.zxh.interceptor.CustomHandlerInterceptor;

/**
 * Date:2023/3/27
 * Author：zxh
 * Description:
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    private final String[] excludePath = {"/css/**","/images/**","/api/login"};

    @Resource
    private CustomHandlerInterceptor customHandlerInterceptor;

    @Resource
    private AuthInterceptor authInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/api/**").excludePathPatterns(excludePath);
        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns(excludePath);
    }
}
