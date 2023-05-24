package top.philsongzi.codingmorejpa;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import top.philsongzi.codingmorejpa.entity.User;
import top.philsongzi.codingmorejpa.service.UserService;

@SpringBootTest
@Slf4j
class CodingmoreJpaApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        // 查询所有
        userService.findAll().stream().forEach(user -> log.info("查询所有{}", user));

        // 新增数据
        // 在一开始写的时候， new User().setId().setAge() 报错说没有 .setId().setAge()方法。。但是后来突然又好了，不明白啊
        userService.save(new User().setId(2).setAge(12).setName("沉默王三").setPassword("123456"));
        userService.save(new User().setId(3).setAge(13).setName("沉默王四").setPassword("123456"));
        userService.save(new User().setId(4).setAge(14).setName("沉默王五").setPassword("123456"));

        // 分页查询
        userService.findAll(PageRequest.of(1,2)).stream().forEach(user -> log.info("分页查询{}", user));
        // 模糊查询
        log.info("模糊查询{}",userService.findByNameLike("沉默"));
        // 删除
        userService.delete(1);
    }

}
