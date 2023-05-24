package top.philsongzi.codingmorethymeleaf.controller;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.philsongzi.codingmorethymeleaf.service.PostService;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description
 */
@Controller
@RequestMapping("/posts")
public class PostController {

    @Resource
    private PostService postService;

    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "all";
    }
}
