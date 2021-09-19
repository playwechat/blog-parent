package com.mszlu.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author playwechat Email:1036907088@qq.com
 * @Description
 * @date 2021/9/5 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVo {
    private Long id;

    private String tile;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    private int weight;
    /*
    创建时间
     */
    private String createDate;

    private String author;

//    private ArticleBodyVo body;

    private List<TagVo> tags;

//    private List<CategoryVo> categorys;
}
