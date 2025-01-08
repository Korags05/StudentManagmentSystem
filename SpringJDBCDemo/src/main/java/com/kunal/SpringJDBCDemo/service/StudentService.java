package com.kunal.SpringJDBCDemo.service;

import com.kunal.SpringJDBCDemo.Dao.StudentRepo;
import com.kunal.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //service class layer
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student student) {
        repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
