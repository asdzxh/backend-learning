package top.zxh.interceptor;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import top.zxh.service.TestService;

/**
 * Date:2023/3/27
 * Author：zxh
 * Description:
 */
@Component
@Slf4j
public class CustomHandlerInterceptor implements HandlerInterceptor {
    @Resource
    private TestService testService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle:请求接口前调用");
        log.info(testService.test());
        //返回true就放行请求去访问接口,返回false就中断本次请求
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle:请求后调用");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion: 请求调用完成后的回调，即在视图渲染完成后回调");
    }
}
