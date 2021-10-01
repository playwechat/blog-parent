package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.LoginParam;
import com.mszlu.blog.vo.params.RegisterParam;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoginService {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    public Result login(LoginParam loginParam);

    /**
     * 通过token信息检查用户是否存在
     * @param token
     * @return 用户类
     */
    SysUser checkUserByToken(String token);

    /**
     * 通过删除token实现退出登录
     * @param token
     * @return
     */
    Result loginOutByToken(String token);

    /**
     * 注册功能
     * @param registerParam
     * @return
     */
    Result register(RegisterParam registerParam);
}
