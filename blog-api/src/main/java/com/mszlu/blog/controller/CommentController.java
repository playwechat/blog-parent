package com.mszlu.blog.controller;


import com.mszlu.blog.service.CommentService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.CommentParam;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;


//接口url：/comments/article/{id}
//请求方式：GET

/**
 * 1.根据comment表的作者id和文章id，查询用户信息和文章信息
 * 2.判断level的值，看是否有子评论
 * 3.如果有子评论就在进行查询
 */
@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/article/{id}")
    public Result comments(@PathVariable("id") Long articleId){
        return commentService.commentsByArticleId(articleId);
    }


    @PostMapping("/create/change")
    public Result creatComment(@RequestBody CommentParam commentParam){
        return commentService.creatComment(commentParam);
    }

}
