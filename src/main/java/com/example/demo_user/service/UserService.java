package com.example.demo_user.service;

import com.example.demo_user.dto.UserDto;
import com.example.demo_user.entities.UserNameEntity;
import com.example.demo_user.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepositories userRepositories;

    public UserNameEntity save(UserDto userDto){
        return userRepositories.save(userDto.mapperEntity());
    }
}
