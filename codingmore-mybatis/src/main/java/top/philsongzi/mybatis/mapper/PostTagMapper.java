package top.philsongzi.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import top.philsongzi.mybatis.entity.PostTag;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @since 2023/6/6
 */
// 继承 BaseMapper 无需编写 sql 即可 crud。
@Repository     // you一点怪，直接一个接口拿去用吗
public interface PostTagMapper extends BaseMapper<PostTag> {
}
