package com.example.demo;

import com.example.demo.model.Alien;
import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.service.LaptopService;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);


		Laptop laptop = context.getBean(Laptop.class);

		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(laptop);


//		Alien alien = context.getBean(Alien.class);
//		alien.code();


	}

}
