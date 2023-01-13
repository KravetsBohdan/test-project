package com.example.testproject.service;

import com.example.testproject.entity.User;
import com.example.testproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public User addUser(User user) {
        return userRepository.save(user);

    }

    public User updateUser(int id, User user) {
        user.setId(id);

        return userRepository.save(user);

    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }


    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

}
