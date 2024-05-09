package org.example.entity;

import org.example.dto.UserRegisterRequest;

public class User {
    Integer userId;
    String username;
    String email;
    String password;

    int age;

    public User(String username, String email, String password, int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public User(UserRegisterRequest request) {
        this(request.getUsername(), request.getEmail(), request.getPassword(), request.getAge());
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
