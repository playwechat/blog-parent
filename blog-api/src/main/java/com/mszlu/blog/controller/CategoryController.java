package com.mszlu.blog.controller;

import com.mszlu.blog.service.CategoryService;
import com.mszlu.blog.vo.CategoryVo;
import com.mszlu.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("categorys")
public class CategoryController {

    @Autowired
        private CategoryService categoryService;

    @GetMapping
    public Result listCategory() {
        return categoryService.findAll();
    }

    @GetMapping("detail")
    public Result categoriesDetail(){
        return categoryService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result categoriesDetailById(@PathVariable("id") Long id){
        return categoryService.categoriesDetailById(id);
    }

}
