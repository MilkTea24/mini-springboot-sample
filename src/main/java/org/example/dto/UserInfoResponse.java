package org.example.dto;

public class UserInfoResponse {
    Integer userId;
    String username;
    String email;
    String password;

    int age;

    public UserInfoResponse(Integer userId, String username, String email, String password, int age) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public UserInfoResponse(Integer userId, String username) {
        this.userId = userId;
        this.username = username;
        this.email = null;
        this.password = null;
        this.age = 0;
    }
}
