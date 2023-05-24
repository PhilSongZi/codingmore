package top.philsongzi.codingmorejpa.service;

import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.philsongzi.codingmorejpa.entity.User;
import top.philsongzi.codingmorejpa.repository.UserRepository;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description 服务接口实现类。.
 */
@Service    // 类似于@Component注解（通用注解），用在服务层。springboot会自动扫描该类注解所注解的类。将其加入到spring容器中。
public class UserServiceImpl implements UserService{

    @Resource   // 自动装配对象。（由java提供的注解）。使用 byName 装配。
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public List<User> findByNameLike(String name) {
        return userRepository.findByNameLike(name);
//        return userRepository.findByNameLikeParam(name);
//        return userRepository.findByNameLikeNativeQuery(name);
    }
}
