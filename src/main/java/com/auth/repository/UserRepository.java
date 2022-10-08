package com.auth.repository;

import com.auth.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
   User findUserByLoginAndPassword(String email, String password);
}
