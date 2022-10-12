package com.auth.service;

import com.auth.dto.UserDto;
import com.auth.entity.User;
import com.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public UserDto findByLoginAndPassword(UserDto userDto) {
        String email = userDto.getLogin();
        String password = userDto.getPassword();
        User user = repository.findUserByLoginAndPassword(email, password);
        return user == null ? new UserDto() : new UserDto(email, password);
    }

    public void saveUsersToDb() {
        User user1 = User.builder()
                .login("petrova@gmail.com")
                .password("Irina111")
                .build();

        User user2 = User.builder()
                .login("ivanov@gmail.com")
                .password("Ivan1111")
                .build();
        repository.saveAll(List.of(user1, user2));
    }
}
