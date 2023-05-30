package top.philsongzi.codingmorefilterinterceptorlistener.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/30
 * @description 用于被拦截的控制器类。
 */
// @RestController  注解相当于 @Controller  + @ResponseBody  注解，
// @ResponseBody  注解用于将 Controller 方法返回的对象，通过适当的 HttpMessageConverter 转换为指定格式后，
// 写入到 Response 对象的 body 数据区，通常用来返回 JSON 或者 XML 数据，返回 JSON 数据的情况比较多。
@RestController
@RequestMapping("/myinterceptor")
public class MyInterceptorController {

    @RequestMapping("/hello")
    public String hello() {
        return "小子松是个大笨比！";
    }
}
