package com.kunal.SpringJDBCDemo.Dao;

import com.kunal.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {

        String query = "insert into student (rollno, name, marks) values (?,?,?)";

        int rows = jdbcTemplate.update(query, student.getRoll(), student.getName(), student.getMarks());
        System.out.println(rows + " effected...");
    }

    public List<Student> findAll() {

        List<Student> studentList = new ArrayList<>();
        return  studentList;

    }
}
