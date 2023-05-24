package top.philsongzi.codingmorethymeleaf.service;

import top.philsongzi.codingmorethymeleaf.entity.Post;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description
 */
public interface PostService {

    Post findById(Integer id);
    List<Post> findAll();
    Post save(Post post);
    void delete(Integer id);
}
