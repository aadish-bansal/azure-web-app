package com.nagarro.app.test.user.controller;

import com.nagarro.app.test.user.entity.User;
import com.nagarro.app.test.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    private final UserService USER_SERVICE;

    @GetMapping
    public List<User> getAllUsers(){
        return this.USER_SERVICE.getAllUsers();
    }



}
