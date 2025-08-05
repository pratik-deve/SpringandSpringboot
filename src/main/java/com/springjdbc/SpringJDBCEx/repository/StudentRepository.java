package com.springjdbc.SpringJDBCEx.repository;

import com.springjdbc.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentRepository {

    public JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student){
        String sql = "insert into student (rollNo, name, marks) values (?, ?, ?)";

        int rows = jdbc.update(sql, student.getRoll(), student.getName(), student.getMarks());
        System.out.println(rows + " rows affected");



    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;
    }
}
