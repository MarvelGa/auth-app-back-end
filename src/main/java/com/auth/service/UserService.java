package com.auth.service;

import com.auth.dto.UserDto;
import com.auth.entity.User;
import com.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public UserDto findByLoginAndPassword(UserDto userDto) {
        String email = userDto.getLogin();
        String password = userDto.getPassword();
        User user = repository.findUserByLoginAndPassword(email, password);
        return user == null ? new UserDto() : new UserDto(user.getLogin(), userDto.getPassword());
    }
}
