package com.mszlu.blog.controller;


import com.mszlu.blog.service.LoginService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.RegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterControllerr {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result register(@RequestBody RegisterParam registerParam){
        return loginService.register(registerParam);
    }
}
