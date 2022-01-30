package com.yanfang.woc.controller;

import com.yanfang.woc.entity.Account;
import com.yanfang.woc.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 以下是用户注册和登录代码
 *
 **/
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    // 示例给我删了。。。。

    /**
     * 完成注册功能
     * 选做：对密码进行加密处理
     *
     */
    @PostMapping("/register")
    public void uploadUsername(Account account)
    {
        userService.registerNewAccount(account);
    }


    /**
     * 完成登录功能
     *
     * @return 是否登录成功
     */
    @PostMapping("/login")
    public Boolean login(Account account)
    {
        Boolean bool = userService.loginAccount(account);
        if (bool)
            return true;
        else
            return false;
    }
}


