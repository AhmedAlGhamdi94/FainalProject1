package com.example.Final.project.Controller;

import com.example.Final.project.Service.interfaces.RoleService;
import com.example.Final.project.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
   private RoleService roleService;

    @GetMapping("/all")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();}

    @GetMapping("/{roleId}")
    public Role getRoleById(@PathVariable String roleId) {return roleService.getRoleById(roleId);
 }

    @PostMapping("/addRole")
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
   }

    @DeleteMapping("/delete/{roleId}")
    public void deleteRole(@PathVariable String roleId) {
        roleService.deleteRole(roleId);
    }
}
