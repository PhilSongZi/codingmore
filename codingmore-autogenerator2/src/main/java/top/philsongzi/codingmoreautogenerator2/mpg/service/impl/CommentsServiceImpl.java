package top.philsongzi.codingmoreautogenerator2.mpg.service.impl;

import top.philsongzi.codingmoreautogenerator2.mpg.entity.Comments;
import top.philsongzi.codingmoreautogenerator2.mpg.mapper.CommentsMapper;
import top.philsongzi.codingmoreautogenerator2.mpg.service.ICommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author 小子松
 * @since 2023-06-07
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
