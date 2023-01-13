package com.example.testproject.controller;


import com.example.testproject.entity.User;
import com.example.testproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);

    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }


    @GetMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }
}
