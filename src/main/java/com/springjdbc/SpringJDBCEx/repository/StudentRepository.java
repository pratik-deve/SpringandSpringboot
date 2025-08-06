package com.springjdbc.SpringJDBCEx.repository;

import com.springjdbc.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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


        String sql = "select * from student";

        //We can write this without using lambda function also as below
       /* RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setRoll(rs.getLong("rollNo"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));
                return student;
            }
        };

        return jdbc.query(sql, mapper);*/


        return jdbc.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setRoll(rs.getLong("rollNo"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));
            return student;
        });
    }
}
