package top.philsongzi.codingmorejpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.philsongzi.codingmorejpa.entity.User;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description 服务接口
 */
public interface UserService {
    /**
     *
     * @method 四个方法，分别是根据ID查找单条记录、查找所有、保存和更新、删除
     */

    User findById(Integer id);
    List<User> findAll();
    User save(User user);
    void delete(Integer id);

    Page<User> findAll(Pageable pageable);
    List<User> findByNameLike(String name);
}
