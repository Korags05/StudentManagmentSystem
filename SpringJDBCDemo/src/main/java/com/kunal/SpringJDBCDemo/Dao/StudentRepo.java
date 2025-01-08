package com.kunal.SpringJDBCDemo.Dao;

import com.kunal.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

        String query1 = "insert into student (rollno, name, marks) values (?,?,?)";

        int rows = jdbcTemplate.update(query1, student.getRoll(), student.getName(), student.getMarks());
        System.out.println(rows + " row(s) affected...");
    }

    public List<Student> findAll() {

        String query2 = "select * from student";

        return jdbcTemplate.query(query2, (rs, rowNum) -> {
            Student s = new Student();
            s.setRoll(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });

    }
}
