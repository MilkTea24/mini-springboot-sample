package org.example.repository;

import com.milktea.myspring.annotations.Repository;
import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    int count = 0;

    public long save(User user) {
        user.setUserId(count);
        users.add(user);
        count = count + 1;
        return user.getUserId();
    }

    public User getByUserId(Integer userId) {
        if (users.size() <= userId) return null;
        return users.get(userId);
    }
}
