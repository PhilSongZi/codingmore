package top.philsongzi.codingmoreknife4j.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小子松
 * @version 1.0
 * @description 控制器类。
 * @since 2023/6/1
 */
@Api(tags = "测试 knife4j")
@RestController
@RequestMapping("knife4j")
public class Knife4jController {

    @ApiOperation("测试")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test() {
        return "小子松大笨比！";
    }
}
