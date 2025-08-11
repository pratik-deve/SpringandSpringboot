package com.springSecutity.Spring.Security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")// as we have different table name in mysql
@Component
public class User {

    @Id
    private String username;

    private String password;
    private String role;
}
