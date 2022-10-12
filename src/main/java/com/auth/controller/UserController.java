package com.auth.controller;

import com.auth.dto.UserDto;
import com.auth.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
        userService.saveUsersToDb();
    }

    @PostMapping
    public UserDto getUserByItsCredentials(@RequestBody UserDto request){
         return userService.findByLoginAndPassword(request);
    }
}
