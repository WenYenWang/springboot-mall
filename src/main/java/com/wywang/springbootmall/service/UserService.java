package com.wywang.springbootmall.service;

import com.wywang.springbootmall.dto.UserLoginRequest;
import com.wywang.springbootmall.dto.UserRegisterRequest;
import com.wywang.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
