package top.philsongzi.mybatis.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @author 小子松
 * @version 1.0
 * @description 实验 xml 版本 mybatis 使用的实体类。
 * @since 2023/6/5
 */
@Data
@Builder
public class Posts {

    private Long postsId;
    private String postAuthor;
    private String postContent;
    private String postTitle;

    /*
    由于 @Data和@Builder  配合使用的时候会导致无参构造方法丢失，所以我们主动声明了无参构造方法，
    并使用 @Tolerate 注解来告诉 lombok 请允许我们的无参构造方法存在（没有无参构造方法的时候会导致 ORM 映射出错）
     */
    @Tolerate
    Posts() {}
}
