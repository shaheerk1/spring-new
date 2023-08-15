package com.example.restservice.service;

import com.example.restservice.entity.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long userId);
}
