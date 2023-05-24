package top.philsongzi.codingmorethymeleaf;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import top.philsongzi.codingmorethymeleaf.entity.Post;
import top.philsongzi.codingmorethymeleaf.service.PostService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
@Slf4j
class CodingmoreThymeleafApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private PostService postService;

    @Test
    // 查詢文章的test類
    void contextLoads() {
        String sql ="select * from posts";
        List<Post> posts = jdbcTemplate.query(sql, new RowMapper<Post>() {
            @Override
            public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
                Post post = new Post();
                post.setId(rs.getInt(1));
                post.setPostAuthor(rs.getString("post_author"));
                post.setPostDate(rs.getString("post_date"));
                post.setPostContent(rs.getString("post_content"));
                post.setPostTitle(rs.getString("post_title"));
                return post;
            }
        });
        log.info("查询成功");
        log.info("文章{}",posts);
    }

    @Test
    void testPostService() {
        // 查詢所有
        postService.findAll().stream().forEach(post -> log.info("查詢所有{}", post));

        // 新增數據
        postService.save(new Post().setId(2).setPostAuthor("小子松").setPostDate("2023-5-24").setPostContent("This is Test2").setPostTitle("test2"));
        postService.save(new Post().setId(3).setPostAuthor("小子松").setPostDate("2023-5-24").setPostContent("This is Test3").setPostTitle("test3"));
        postService.save(new Post().setId(4).setPostAuthor("小子松").setPostDate("2023-5-24").setPostContent("This is Test4").setPostTitle("test4"));
        postService.save(new Post().setId(5).setPostAuthor("小子松").setPostDate("2023-5-24").setPostContent("This is Test5").setPostTitle("test5"));

        // 刪除
        postService.delete(5);
    }
}
