package top.philsongzi.codingmorefilterinterceptorlistener.filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/30
 * @description 过滤器。
 */
// @WebFilter  注解用于将一个类声明为过滤器，
// urlPatterns 属性用来指定过滤器的 URL 匹配模式，filterName 用来定义过滤器的名字。
@WebFilter(urlPatterns = "/*", filterName = "myFilter")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 在 doFilter 方法中加入时间戳的记录
        long start = System.currentTimeMillis();
        chain.doFilter(request, response);
        System.out.println("Execute cost=" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
