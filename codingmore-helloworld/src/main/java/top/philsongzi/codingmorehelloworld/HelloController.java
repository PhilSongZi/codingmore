package top.philsongzi.codingmorehelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description here is a description of this file.
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, springboot, 小子松是个大懒狗。。。";
    }
}
