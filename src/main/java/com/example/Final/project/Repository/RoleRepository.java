package com.example.Final.project.Repository;

import com.example.Final.project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {

    Role findByName ( String roleName );
}
