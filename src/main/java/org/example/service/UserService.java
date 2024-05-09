package org.example.service;

import com.milktea.myspring.annotations.Autowired;
import com.milktea.myspring.annotations.PostConstruct;
import com.milktea.myspring.annotations.Service;
import org.example.dto.UserInfoResponse;
import org.example.dto.UserRegisterRequest;
import org.example.dto.UserRegisterResponse;
import org.example.entity.User;
import org.example.repository.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRegisterResponse register(UserRegisterRequest request) {
        User user = new User(request);
        return new UserRegisterResponse(userRepository.save(user));
    }

    public UserInfoResponse getUserInfo(Integer userId, boolean isDetailed) {
        User user = userRepository.getByUserId(userId);
        if (isDetailed) return new UserInfoResponse(user.getUserId(), user.getUsername(), user.getEmail(), user.getPassword(), user.getAge());
        else return new UserInfoResponse(user.getUserId(), user.getUsername());
    }

    @PostConstruct
    public void setup() {
        System.out.println("UserService 빈 생성 완료");
    }
}
