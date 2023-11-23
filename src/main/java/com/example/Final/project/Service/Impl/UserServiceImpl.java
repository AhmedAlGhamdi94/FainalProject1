package com.example.Final.project.Service.Impl;
import com.example.Final.project.Repository.UserRepository;
import com.example.Final.project.Service.interfaces.UserService;
import com.example.Final.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl ( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserById ( String id ) {
        return userRepository.findById(id);
    }

    @Override
    public User getUserByUsername ( String username ) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User createUser ( User user ) {
        return userRepository.save(user);
    }

    @Override
    public User editRole ( User user ) {
        return user;
    }



    @Override
    public User editRole ( String userId, String newRole ) {

        return userRepository.editRole(String.valueOf(Integer.parseInt(userId)), newRole);
}
}
