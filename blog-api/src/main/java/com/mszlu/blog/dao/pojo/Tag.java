package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * 标签
 */
@Data
public class Tag {

    //标签id
    private Long id;

    //头像
    private String avatar;

    //标签名
    private String tagName;

}