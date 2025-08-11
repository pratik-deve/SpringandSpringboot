package com.springSecutity.Spring.Security.repo;

import com.springSecutity.Spring.Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

    public User findByUsername(String username);
}
