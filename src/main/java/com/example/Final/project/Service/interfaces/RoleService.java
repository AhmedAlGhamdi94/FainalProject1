package com.example.Final.project.Service.interfaces;

import com.example.Final.project.entity.Role;

import java.util.List;

public interface RoleService  {

    List<Role> getAllRoles();

    Role getRoleById(String roleId);

    Role saveRole(Role role);

    void deleteRole(String roleId);

    // For example:
    Role getRoleByName ( String roleName );
}
