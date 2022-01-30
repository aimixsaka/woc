package com.yanfang.woc.service;

import com.yanfang.woc.entity.Account;
import com.yanfang.woc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 *
 **/
@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;

    // 被controller调用,调用mapper的getAmountOfAccount方法.
    // 获取用户总数
    public Integer getAmountOfAccount()
    {
        return userMapper.getAmountOfAccounts();
    }

    // 根据用户名删除用户
    public void deleteAccountByName(String userName)
    {
        userMapper.deleteAccountByName(userName);
    }

    // 注册用户
    public void registerNewAccount(Account account)
    {
        userMapper.registerNewAccount(account.getUsername(), account.getPassword(), account.getEmail());
    }


    // 登录用户
    public boolean loginAccount(Account account3)
    {
        String name = account3.getUsername();
        String pwd = account3.getPassword();
        if (pwd.equals(userMapper.checkPwd(name)))
        {
            String uname = userMapper.loginAccount(account3.getEmail(), account3.getPassword());
            if (name.equals(uname))
                return true;
            else return false;
        }
        else return false;
    }

}
