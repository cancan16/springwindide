package com.baomidou.springwind.service.impl;

import com.baomidou.springwind.entity.SysLog;
import com.baomidou.springwind.entity.User;
import com.baomidou.springwind.mapper.SysLogMapper;
import com.baomidou.springwind.mapper.UserMapper;
import com.baomidou.springwind.service.IUserTestService;
import com.baomidou.springwind.service.support.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User 表数据服务层接口实现类
 */
@Service
public class UserTestServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserTestService {

    @Autowired
    private SysLogMapper sysLogMapper;

    public void testUser() {
        SysLog sysLog = new SysLog();
        sysLogMapper.insert(sysLog);
//        int i = 1 / 0;
    }
}