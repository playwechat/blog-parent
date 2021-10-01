package com.mszlu.blog.utils;

import com.mszlu.blog.dao.pojo.SysUser;

public class UserThreadLocal {


    private UserThreadLocal(){

    }
    private static final ThreadLocal<SysUser> LOCAL_USER = new ThreadLocal<>();

    /**
     * 存放
     * @param sysUser
     */
    public static void put(SysUser sysUser){
        LOCAL_USER.set(sysUser);
    }
    public static SysUser get(){
        return LOCAL_USER.get();
    }
    public static void remove(){
        LOCAL_USER.remove();
    }



}
