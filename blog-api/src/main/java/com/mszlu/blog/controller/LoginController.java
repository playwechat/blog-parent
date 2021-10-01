package com.mszlu.blog.controller;


import com.mszlu.blog.service.LoginService;
import com.mszlu.blog.vo.params.LoginParam;
import com.mszlu.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam){

        return loginService.login(loginParam);
    }


}
