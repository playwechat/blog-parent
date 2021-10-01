package com.mszlu.blog.service;

import com.mszlu.blog.vo.CategoryVo;


/**
 * 根据Category表的id查询文章分类
 */
public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);
}