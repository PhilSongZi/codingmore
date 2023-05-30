package top.philsongzi.codingmorefilterinterceptorlistener.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.philsongzi.codingmorefilterinterceptorlistener.interceptor.LoggerInterceptor;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/30
 * @description 拦截器配置类。
 */
@Configuration // @Configuration  注解用于定义配置类，干掉了以往 Spring 繁琐的 xml 配置文件。
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 憨批。注意调用方法的是谁啊。拦截器里面没有这个方法你不知道回去看是不是addInterceptor在调用啊
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }
}
