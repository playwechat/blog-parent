package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author playwechat Email:1036907088@qq.com
 * @Description  标签mapper
 * @date 2021/9/5 9:48
 */
@Repository
public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章id查询标签列表
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);


    /**
     * 查询最热标签，更具limit自定义被引用的次数
     * @param limit 标签被引用次数
     * @return
     */
    List<Long> findTagsHos(int limit);

    /**
     * 根据最热标签的id查找标签名
     * @param listTagsHot 最热标签
     * @return
     */
    List<Tag> findTagNameByTagId(List<Long> listTagsHot);
}
