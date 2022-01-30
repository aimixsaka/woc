package com.yanfang.woc.controller;

import com.yanfang.woc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 **/
@RestController
@RequestMapping("/admin")
public class AdminController
{
    /**
     * 获取当前的账户总数
     *
     */
    @Autowired
    private UserService userService;
    @GetMapping("/getAmount")
    public Integer getAmountOfAccounts()
    {
        return userService.getAmountOfAccount();
    }

    /**
     * 根据用户名删除账户
     *
     */
    @PutMapping("deleteAccount" )
    public void deleteAccount(String username)
    {
        userService.deleteAccountByName(username);
    }
}
