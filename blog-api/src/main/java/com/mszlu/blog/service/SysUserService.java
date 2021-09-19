package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
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
}
