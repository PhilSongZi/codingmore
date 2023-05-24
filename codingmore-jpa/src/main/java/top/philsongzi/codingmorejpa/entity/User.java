package top.philsongzi.codingmorejpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;


/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description 实体类
 */
@Data  // lombok注解，自动添加getter setter
@Entity     // 元数据注解，表面该类是实体类，默认使用ORM规则（类名即为数据库表名，类中字段即为库表中的字段）
@Table(name = "user")       // 非必选项，优先级高于 @Entity
@ToString
@Accessors(chain = true)
public class User {

    @Id     // 表明该字段为主键。当使用了 @Entity时必须使用 @Id声明主键。
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "password", nullable = false, length = 10)
    private String password;

    @Column(name = "age", nullable = false)
    private Integer age;

    public User() {}

}
