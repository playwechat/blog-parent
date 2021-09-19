package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.Article;
import com.mszlu.blog.vo.ArticleVo;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.PageParams;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author playwechat Email:1036907088@qq.com
 * @Description
 * @date 2021/9/5 10:08
 */


public interface ArticleService {
    Result listArticlesPage(PageParams pageParams);
}
