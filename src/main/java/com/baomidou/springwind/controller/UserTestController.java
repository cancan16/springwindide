package com.baomidou.springwind.controller;

import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Permission;
import com.baomidou.springwind.service.IUserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;

/**
 * restful接口测试
 * url:http://localhost:8080/nullframe/rest/user
 */
@Controller
@RequestMapping("/userTest")
public class UserTestController extends BaseController {

    @Autowired
    private IUserTestService userTestService;

    /**
     * 测试queryOne
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryOne", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public void queryOne(@RequestBody String json, ServletRequest request) {
        System.out.println("1321");
        userTestService.testUser();
    }
}
