package org.example.controller;

import com.milktea.myspring.annotations.*;
import org.example.dto.UserInfoResponse;
import org.example.dto.UserRegisterRequest;
import org.example.dto.UserRegisterResponse;
import org.example.service.UserService;

@RestController
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserRegisterResponse register(@RequestBody UserRegisterRequest request) {
        return userService.register(request);
    }

    @GetMapping("/user/{userId}")
    public UserInfoResponse getUserInfo(@PathVariable("userId") Integer user,
                                        @RequestParam(required = false, defaultValue="false") boolean isDetailed) {
        return userService.getUserInfo(user, isDetailed);
    }

    @PostConstruct
    public void setup() {
        System.out.println("UserController 빈 생성 완료");
    }
}
