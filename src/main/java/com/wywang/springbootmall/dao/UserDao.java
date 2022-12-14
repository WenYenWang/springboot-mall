package com.wywang.springbootmall.dao;

import com.wywang.springbootmall.dto.UserRegisterRequest;
import com.wywang.springbootmall.model.User;
import com.wywang.springbootmall.service.UserService;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
