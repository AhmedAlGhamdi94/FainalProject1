package com.example.Final.project.Repository;

import com.example.Final.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.role = :newRole WHERE u.id = :userId")
    User editRole(String userId, String newRole);

   // User editRole ( User user );
}
