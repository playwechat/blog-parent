package com.mszlu.blog.controller;

import com.mszlu.blog.service.TagService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * desc：最热标签展示控制层
 * 1.映射地址
 * 2.确定请求方式
 */
@RequestMapping("tags")
@RestController
public class TagsController {

    @Autowired
    private TagService tagService;

    @GetMapping("/hot")
    public Result listHotTags(){
        int limit = 6;
        List<TagVo> tagVoList = tagService.hot(limit);
        return Result.success(tagVoList);
    }

}
