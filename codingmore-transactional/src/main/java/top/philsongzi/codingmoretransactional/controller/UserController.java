package top.philsongzi.codingmoretransactional.controller;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.philsongzi.codingmoretransactional.entity.User;
import top.philsongzi.codingmoretransactional.service.UserService;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description User 控制器。可查询全部 & 更新数据。
 */
@Controller     //@Controller 表示該類是一個控制器類
@RequestMapping("/user")    // 處理請求地址映射，可用於類或方法
public class UserController {

    @Resource
    private UserService userService;

    // Model 接口可以承載數據庫裡查詢到的數據，前端可以從 model中取出來
    // 查询全部
    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("users", userService.findAll());
        return "all";
    }

    // 更新功能接口
    @RequestMapping("/update")
    public String update(Model model) {
        User user = userService.findById(2);
        user.setName("小子松是个大憨批");
        userService.update(user);
        return "update";
    }
}
