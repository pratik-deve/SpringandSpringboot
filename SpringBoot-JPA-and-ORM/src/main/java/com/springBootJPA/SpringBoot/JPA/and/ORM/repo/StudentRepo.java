package com.springBootJPA.SpringBoot.JPA.and.ORM.repo;

import com.springBootJPA.SpringBoot.JPA.and.ORM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
//First is of the entity type and second is the type of primary key
public interface StudentRepo extends JpaRepository<Student, Integer> {

    //We are writing here jql (check for syntax)
    @Query("select s from Student s where s.name = ?1") //This not required for name
    Optional<Student> findByName(String name);

    @Query("select s from Student s where s.marks >= ?1")
    List<Optional<Student>> findMarksGreaterThan(int marks);


}
