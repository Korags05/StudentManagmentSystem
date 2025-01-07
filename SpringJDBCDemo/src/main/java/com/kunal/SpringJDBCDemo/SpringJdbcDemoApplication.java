package com.kunal.SpringJDBCDemo;

import com.kunal.SpringJDBCDemo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setMarks(78);
		student.setName("Kunal");
		student.setRoll(101);

//		addStudent(student);

	}

}
