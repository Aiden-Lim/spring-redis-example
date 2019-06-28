package com.aiden.spring.redis.example.repository;

import com.aiden.spring.redis.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
