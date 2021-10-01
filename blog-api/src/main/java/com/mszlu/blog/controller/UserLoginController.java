package com.mszlu.blog.controller;


import com.mszlu.blog.service.SysUserService;
import com.mszlu.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("users")
@RestController
public class UserLoginController {

    //涉及用户，用用户类service
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("currentUser")
    public Result currentUser(@RequestHeader("Authorization")String token){

        return sysUserService.findUserByToken(token);
    }

}
