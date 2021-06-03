package com.application.SpringJPAWithPostgreSQL;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
