package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.Tag;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

/**
 * FileName:TagService
 *
 * @author 王维鑫 Email:1036907088@qq.com
 * @Description 通过文章id获取标签
 * @date 2021/9/6 22:04
 */
public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    List<TagVo> hot(int limit);

    /**
     * 查找所有标签
     * @param tag
     * @return
     */
    Result findAllTags(Tag tag);
}
