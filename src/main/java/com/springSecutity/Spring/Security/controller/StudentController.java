package com.springSecutity.Spring.Security.controller;

import com.springSecutity.Spring.Security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    List<Student> students = new ArrayList<>(
            List.of(
                    new Student(123, "Suresh"),
                    new Student(124, "Nagendra")
            )
    );

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){

        students.add(student);
    }

    @GetMapping("/token")
    public CsrfToken getToken(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }
}
