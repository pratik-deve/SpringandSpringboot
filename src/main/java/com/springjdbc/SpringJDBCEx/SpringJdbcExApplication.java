package com.springjdbc.SpringJDBCEx;

import com.springjdbc.SpringJDBCEx.model.Student;
import com.springjdbc.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student stud = context.getBean(Student.class);

		stud.setMarks(49);
		stud.setName("Subhash");
		stud.setRoll(104);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(stud);

		System.out.println(service.getStudents());

	}

}
