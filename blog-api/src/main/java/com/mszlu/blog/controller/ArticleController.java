package com.mszlu.blog.controller;

import com.mszlu.blog.common.aop.LogAnnotation;
import com.mszlu.blog.common.cache.Cache;
import com.mszlu.blog.service.ArticleService;
import com.mszlu.blog.vo.ArticleVo;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.ArticleParam;
import com.mszlu.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author playwechat Email:1036907088@qq.com
 * @Description
 * @date 2021/9/5 9:49
 */

@RestController
@RequestMapping("articles")
public class ArticleController {


    @Autowired
    private ArticleService articleService;
    /*
    返回统一处理结果
     */
    @Cache(expire = 5 * 60 * 1000,name = "listArticle")
    @PostMapping
    @LogAnnotation(module="文章",operater="获取文章列表")
    public Result listArticle(@RequestBody PageParams pageParams){
        return articleService.listArticlesPage(pageParams);
    }

    /**
     * 最热文章
     * @return
     */
    @PostMapping("hot")
    public Result hotArticle(){
        int limit = 5;
        return articleService.hotArticles(limit);
    }

    /**
     * 最新文章展示
     * @return
     */
    @PostMapping("new")
    public Result newArticle(){
        int limit = 5;
        return articleService.newArticles(limit);
    }

    /**
     * 文章归档
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }


    /**
     * 根据文章id获取文章详情，包括文章内容，标签，分类
     * 涉及两个表，需要连表查询
     * 用ArticleVo接收查询结果
     * @param id
     * @return
     */
    @PostMapping("/view/{id}")
    public Result findDetailArticleById(@PathVariable("id") Long id){
        ArticleVo articleVo = articleService.findDetailArticleById(id);
        return Result.success(articleVo);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }


}
