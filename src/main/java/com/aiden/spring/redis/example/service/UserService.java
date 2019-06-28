package com.aiden.spring.redis.example.service;

import com.aiden.spring.redis.example.domain.User;
import com.aiden.spring.redis.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Cacheable(cacheNames = "user", key = "#id")
    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    @Cacheable(cacheNames = "users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
