package com.example.Final.project.Service.interfaces;

import com.example.Final.project.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById( String id);
    User getUserByUsername(String username);
    User createUser(User user);

    User editRole ( User user );

    User editRole ( String userId, String newRole );


}

