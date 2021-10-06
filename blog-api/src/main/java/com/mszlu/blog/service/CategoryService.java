package com.mszlu.blog.service;

import com.mszlu.blog.vo.CategoryVo;
import com.mszlu.blog.vo.Result;


/**
 * 根据Category表的id查询文章分类
 */
public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    /**
     * 查找所有的标签
     * @return
     */
    Result findAll();
}
