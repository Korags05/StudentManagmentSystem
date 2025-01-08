package com.kunal.SpringJDBCDemo.Dao;

import com.kunal.SpringJDBCDemo.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(Student student) {
        System.out.println("Student Added...");
    }

    public List<Student> findAll() {

        List<Student> studentList = new ArrayList<>();
        return  studentList;

    }
}
