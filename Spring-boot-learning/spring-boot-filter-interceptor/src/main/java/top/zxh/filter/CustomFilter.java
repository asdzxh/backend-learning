package top.zxh.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * Date:2023/3/27
 * Author：zxh
 * Description:
 */
@Slf4j
//@WebFilter(urlPatterns = {"/*"})
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("CustomFilter 之前执行的逻辑");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("CustomFilter 之后 处理响应");
    }

    @Override
    public void destroy() {
        log.info("filter 销毁");    }
}
