package org.example.dto;


public class UserRegisterRequest {
    private String username;
    private String email;
    private String password;

    private int age;

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
