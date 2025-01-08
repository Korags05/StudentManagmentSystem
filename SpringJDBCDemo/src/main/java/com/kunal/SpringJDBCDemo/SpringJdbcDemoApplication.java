package com.kunal.SpringJDBCDemo;

import com.kunal.SpringJDBCDemo.model.Student;
import com.kunal.SpringJDBCDemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setMarks(78);
		student.setName("Kunal");
		student.setRoll(104);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(student);

		List<Student> students_list = service.getStudents();
		System.out.println(students_list);

	}

}
