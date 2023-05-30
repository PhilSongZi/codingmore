package top.philsongzi.codingmoretransactional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import top.philsongzi.codingmoretransactional.entity.User;

import java.util.List;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description 简单的对表进行增删改查操作，那么只需要继承 JpaRepository 接口，并传递两个参数（第一个为实体类，第二个为主键类型）即可
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.name LIKE CONCAT('%', :name, '%')")
    List<User> findByNameLike(@Param("name") String name);
//
//    @Query(value = "SELECT * FROM user u WHERE u.name like '%'|| ?1 || '%'",
//            nativeQuery = true)
//    List<User> findByNameLikeNativeQuery(String name);
//
//    @Query("select u from User u where u.name like concat('%',:name,'%')")
//    List<User> findByNameLikeParam(@Param("name")String name);

}
