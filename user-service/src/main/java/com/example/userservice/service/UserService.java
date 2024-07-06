package com.example.userservice.service;

import com.example.userservice.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    int getUserNum();
    User getUserById(String SID);
    int updateUserById(User user);
    int deleteUser(List<String> SIDList);
}
