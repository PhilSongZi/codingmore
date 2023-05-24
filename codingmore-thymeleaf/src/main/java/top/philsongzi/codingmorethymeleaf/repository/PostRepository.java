package top.philsongzi.codingmorethymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.philsongzi.codingmorethymeleaf.entity.Post;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description
 */
public interface PostRepository extends JpaRepository<Post, Integer> {

}
