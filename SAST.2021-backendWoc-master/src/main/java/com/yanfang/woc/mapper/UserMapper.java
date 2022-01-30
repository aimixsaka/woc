package com.yanfang.woc.mapper;

import com.yanfang.woc.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 衍方
 *
 **/
@Mapper
@Repository
public interface UserMapper
{

    // 获取用户总数
    Integer getAmountOfAccounts();

    // 根据用户名删除用户
    void deleteAccountByName(@Param("userName") String userName);

    // 注册用户
    void registerNewAccount(@Param("userName") String userName, @Param("userPwd") String userPwd, @Param("userEmail") String userEmail);

    // 登录用户
    String loginAccount(@Param("Email") String email, @Param("Password") String password);

    // 登录的核验方法
    String checkPwd(@Param("userName") String userName);
}

