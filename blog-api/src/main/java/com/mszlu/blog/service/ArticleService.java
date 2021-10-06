package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.Article;
import com.mszlu.blog.vo.ArticleVo;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.ArticleParam;
import com.mszlu.blog.vo.params.PageParams;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author playwechat Email:1036907088@qq.com
 * @Description
 * @date 2021/9/5 10:08
 */


public interface ArticleService {

    /**
     * 文章列表展示
     * @param pageParams
     * @return
     */
    Result listArticlesPage(PageParams pageParams);

    /**
     * 最热文章
     * @param limit  最多显示几个最热文章
     * @return
     */
    Result hotArticles(int limit);

    /**
     * 最新文章
     * @param limit  显示条数
     * @return
     */
    Result newArticles(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    /**
     * 查询文章详情
     * @param id 文章id
     * @return
     */
    ArticleVo findDetailArticleById(Long id);

    /**
     * 写文章
     * @param articleParam
     * @return
     */
    Result publish(ArticleParam articleParam);
}
