package top.philsongzi.mybatis.mapper;

import org.springframework.stereotype.Repository;
import top.philsongzi.mybatis.entity.Posts;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @since 2023/6/5
 */
@Repository     // 作为 bean 扫描目标
public interface PostMapper {

    // 接口只定义使用的方法，具体实现的查询语句在 xml 中。
    List<Posts> getAll();
    Posts getOne(Long id);
    void insert(Posts post);
    void update(Posts post);
    void delete(Long id);
}
