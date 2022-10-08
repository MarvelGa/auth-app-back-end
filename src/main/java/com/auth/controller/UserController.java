package com.auth.controller;

import com.auth.dto.UserDto;
import com.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public UserDto getUserByItsCredentials(@RequestBody UserDto request){
         return userService.findByLoginAndPassword(request);
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return new UserDto();
    }
}
