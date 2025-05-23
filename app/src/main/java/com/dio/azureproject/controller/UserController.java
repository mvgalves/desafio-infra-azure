package com.dio.azureproject.controller;

import com.dio.azureproject.model.User;
import com.dio.azureproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        repository.save(user);
        return "Usuário adicionado!";
    }
}
