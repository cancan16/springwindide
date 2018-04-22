package com.baomidou.springwind.service;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.springwind.entity.User;

/**
 * User 表数据服务层接口
 */
public interface IUserTestService extends IService<User> {
    void testUser();
}