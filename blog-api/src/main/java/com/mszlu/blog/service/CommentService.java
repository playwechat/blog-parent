package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.CommentParam;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentService {
    Result commentsByArticleId(Long articleId);

    /**
     * 评论功能
     * @param commentParam
     * @return
     */
    Result creatComment(CommentParam commentParam);
}
