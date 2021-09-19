package com.mszlu.blog.service.impl;

import com.mszlu.blog.dao.mapper.SysUserMapper;
import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName:SysUserServiceImpl
 *
 * @author 王维鑫 Email:1036907088@qq.com
 * @Description
 * @date 2021/9/6 22:35
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserByID(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null){
            sysUser = new SysUser();
            sysUser.setNickname("通往神之路");
        }
        return sysUserMapper.selectById(id);
    }
}
