package com.aiden.spring.redis.example.ui.vm;

import com.aiden.spring.redis.example.domain.User;
import lombok.Getter;

@Getter
public class UserVM {

    private int id;
    private String name;

    public UserVM(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
