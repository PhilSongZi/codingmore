package top.philsongzi.codingmoreautogenerator2.mpg.service.impl;

import top.philsongzi.codingmoreautogenerator2.mpg.entity.Posts;
import top.philsongzi.codingmoreautogenerator2.mpg.mapper.PostsMapper;
import top.philsongzi.codingmoreautogenerator2.mpg.service.IPostsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author 小子松
 * @since 2023-06-07
 */
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {

}
