package com.example.userservice.service.impl;

import com.example.userservice.dao.UserDao;
import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        List<User> UserList = userDao.findAllUsers();
        return UserList;
    }

    @Override
    public User getUserById(String SID) {
        User User = userDao.findUserById(SID);
        return User;
    }

    @Override
    public int updateUserById(User user){
        try{
            if(userDao.updateUserById(user) == 1){
                return 1;
            }
            return -1;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("学生端更新个人信息失败");
            return 0;
        }
    }

    @Override
    public int deleteUser(int SID){
        if(userDao.deleteUser(SID) == 1){
            return 1;
        }
        return 0;
    }
}
