package top.philsongzi.codingmoreswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小子松
 * @version 1.0
 * @description 控制器类。
 * @since 2023/5/31
 */
// @Api注解，用在类上，该注解将控制器标注为一个 Swagger 资源，三个属性：
// ● tags，具有相同标签的 API 会被归在一组内展示
// ● value，如果 tags 没有定义，value 将作为 API 的 tags 使用。
// ● description，已废弃
// @RestController  注解，用在类上，是@ResponseBody和@Controller的组合注解，如果方法要返回 JSON 的话，可省去 @ResponseBody  注解。
// @RequestMapping  注解，可用在类（父路径）和方法（子路径）上，主要用来定义 API 的请求路径和请求类型。
@Api(tags = "测试 Swagger")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    // @ApiOperation  注解，用在方法上，描述这个方法是做什么用的。
    @ApiOperation("测试")
    @RequestMapping("/test")
    public String test() {
        return "小子松大懒狗...";
    }
}
