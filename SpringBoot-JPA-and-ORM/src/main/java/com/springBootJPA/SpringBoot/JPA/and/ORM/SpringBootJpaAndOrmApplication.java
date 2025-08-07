package com.springBootJPA.SpringBoot.JPA.and.ORM;

import com.springBootJPA.SpringBoot.JPA.and.ORM.model.Student;
import com.springBootJPA.SpringBoot.JPA.and.ORM.repo.StudentRepo;
import com.springBootJPA.SpringBoot.JPA.and.ORM.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SpringBootJpaAndOrmApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootJpaAndOrmApplication.class, args);


		String[] names = {"Akhil", "Pratik", "Ravi", "Sneha", "Nikita"};
		Random random = new Random();
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		for (int i = 0; i < 5; i++) {
			Student student = context.getBean(Student.class); // create new bean
			student.setName(names[i]);
			student.setRollNo(105 + i);
			student.setMarks(50 + random.nextInt(51)); // random marks between 50 to 10
			studentRepo.save(student);
		}

		System.out.println(studentRepo.findById(105));
		System.out.println(studentRepo.findByName("Nikhil"));
		System.out.println(studentRepo.findMarksGreaterThan(60));




	}

}
