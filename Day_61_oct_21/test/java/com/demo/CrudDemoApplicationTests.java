package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Student;
import com.demo.repositories.StudentRepository;

@SpringBootTest
class CrudDemoApplicationTests {

	@Autowired
	private StudentRepository studentRepo;
	@Test
	void saveOneStudent() {
		Student s=new Student();
		s.setName("Meinal");
		s.setCourse("testing");
		s.setFee(4000);
		studentRepo.save(s);
	}

}
