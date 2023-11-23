package com.example.Final.project.Controller;
import com.example.Final.project.Service.interfaces.UserService;
import com.example.Final.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private  UserService userService;


    public UserController ( UserService userService ) {
        this.userService = userService;
    }

    @GetMapping("/byId/{userId}")
    public Optional<User> getUserById ( @PathVariable String userId ) {
        return userService.getUserById(userId);
    }

    @GetMapping("/byUsername/{username}")
    public User getUserByUsername ( @PathVariable String username ) {
        return userService.getUserByUsername(username);
    }

//    @PostMapping(value="/newUser",consumes={"application/json"})
    @PostMapping("/newUser")
    public User createUser(@RequestBody User user) {

        return userService.createUser(user);
    }


    @PutMapping("/editRole")
    public User editRole ( @RequestBody User user ) {
        return userService.editRole(user);
    }
}


