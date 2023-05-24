package top.philsongzi.codingmoresql;

import lombok.Data;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/24
 * @description 实体类.
 */
@Data
public class User {
    private Integer id;
    private Integer age;
    private String name;
    private String password;
}
