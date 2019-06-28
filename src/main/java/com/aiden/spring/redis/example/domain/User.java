package com.aiden.spring.redis.example.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
public class User implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    private int id;
    private String name;
}
