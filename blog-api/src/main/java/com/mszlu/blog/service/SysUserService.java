package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.UserVo;
import org.springframework.stereotype.Service;

/**
 * FileName:SysUserService
 *
 * @author 王维鑫 Email:1036907088@qq.com
 * @Description
 * @date 2021/9/6 22:33
 */
public interface SysUserService {

    SysUser findUserByID(Long id);

    SysUser findUser(String account, String pwd);

    /**
     * 根据token获取用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 查找账户是否存在
     * @param account
     */
    SysUser findUserByAccount(String account);

    /**
     * 注册信息持久化到数据库
     * @param sysUser
     */
    void save(SysUser sysUser);

    /**
     * 根据id获取用户信息
     * @param authorId
     * @return
     */
    UserVo findUserVoById(Long authorId);
}
