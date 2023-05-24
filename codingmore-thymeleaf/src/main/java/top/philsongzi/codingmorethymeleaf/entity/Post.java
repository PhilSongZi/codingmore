package top.philsongzi.codingmorethymeleaf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Entity
@Table(name = "posts")
@ToString
@Accessors(chain = true)
public class Post {
    @Id
    @Column(name = "post_id", nullable = false)
    private Integer id;

    @Column(name = "post_author", nullable = false, length = 10)
    private String postAuthor;

    @Column(name = "post_date", nullable = false, length = 10)
    private String postDate;

    @Column(name = "post_content", nullable = false, length = 50)
    private String postContent;

    @Column(name = "post_title", nullable = false, length = 20)
    private String postTitle;

}