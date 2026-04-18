package com.jp.apm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.apm.domain.model.User;
import com.jp.apm.repository.UserRepository;

@Service
public class UserService {
    //Crear usuario
    //Buscar usuario por id
    //Listar usuarios

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById( Long id) {
        return userRepository.findById(id).orElseThrow(
            () -> new RuntimeException("User not found"));
    }

    public void deleteUser ( Long id) {
         userRepository.deleteById(id);
    }
}
