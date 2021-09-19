package com.mszlu.blog.service;

import com.mszlu.blog.vo.TagVo;

import java.util.List;

/**
 * FileName:TagService
 *
 * @author 王维鑫 Email:1036907088@qq.com
 * @Description
 * @date 2021/9/6 22:04
 */
public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);
}
