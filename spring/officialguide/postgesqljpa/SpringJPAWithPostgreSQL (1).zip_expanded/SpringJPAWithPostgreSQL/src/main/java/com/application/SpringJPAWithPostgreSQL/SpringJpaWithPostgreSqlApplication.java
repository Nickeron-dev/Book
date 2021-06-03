package com.application.SpringJPAWithPostgreSQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaWithPostgreSqlApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaWithPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = studentRepo.findAll();
		
		students.forEach(System.out :: println);
		
		System.exit(0);
		
	}

}
