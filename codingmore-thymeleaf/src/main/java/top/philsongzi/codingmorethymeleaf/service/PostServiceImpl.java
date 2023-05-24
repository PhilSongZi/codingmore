package top.philsongzi.codingmorethymeleaf.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.philsongzi.codingmorethymeleaf.entity.Post;
import top.philsongzi.codingmorethymeleaf.repository.PostRepository;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description
 */
@Service
public class PostServiceImpl implements PostService{

    @Resource
    private PostRepository postRepository;

    @Override
    public Post findById(Integer id) {
        return postRepository.getById(id);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void delete(Integer id) {
        postRepository.deleteById(id);
    }
}
