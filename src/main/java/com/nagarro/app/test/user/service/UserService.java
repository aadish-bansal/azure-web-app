package com.nagarro.app.test.user.service;

import com.nagarro.app.test.user.entity.User;
import com.nagarro.app.test.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserRepository USER_REPOSITORY ;


    public List<User> getAllUsers() {
        return (List<User>) this.USER_REPOSITORY.findAll();
    }
}
