package com.aiden.spring.redis.example.ui.controller;

import com.aiden.spring.redis.example.service.UserService;
import com.aiden.spring.redis.example.ui.vm.UserVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final UserService userService;

    @Autowired
    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public UserVM getUser(@PathVariable int id) {
        return userService.getUser(id)
                .map(UserVM::new)
                .orElse(null);
    }

    @GetMapping("/users")
    public List<UserVM> getUsers() {
        return userService.getUsers()
                .stream()
                .map(UserVM::new)
                .collect(Collectors.toList());
    }
}
