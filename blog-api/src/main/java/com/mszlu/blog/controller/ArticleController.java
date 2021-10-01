package com.mszlu.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mszlu.blog.dao.mapper.ArticleMapper;
import com.mszlu.blog.dao.pojo.Article;
import com.mszlu.blog.service.ArticleService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping
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

}
