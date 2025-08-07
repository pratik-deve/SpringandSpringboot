package com.springBootJPA.SpringBoot.JPA.and.ORM.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Scope("prototype")
public class Student {

    @Id
    private long rollNo;
    private String name;
    private int marks;
}
