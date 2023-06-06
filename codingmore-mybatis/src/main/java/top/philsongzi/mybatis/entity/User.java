package top.philsongzi.mybatis.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @author 小子松
 * @version 1.0
 * @description 使用注解方式的 mybatis 实验类。
 * @since 2023/6/5
 */
@Data   // 注解自动生产getter和setter
@Builder    // 生成链式调用
public class User {

    private Integer id;
    private Integer age;
    private String name;
    private String password;

    /*
    由于 @Data和@Builder  配合使用的时候会导致无参构造方法丢失，所以我们主动声明了无参构造方法，
    并使用 @Tolerate 注解来告诉 lombok 请允许我们的无参构造方法存在（没有无参构造方法的时候会导致 ORM 映射出错）
     */
    @Tolerate
    User() {}
}
