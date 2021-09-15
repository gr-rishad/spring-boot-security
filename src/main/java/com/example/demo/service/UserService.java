package com.example.demo.service;

import com.example.demo.domin.Role;
import com.example.demo.domin.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void  addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUsers();
}
