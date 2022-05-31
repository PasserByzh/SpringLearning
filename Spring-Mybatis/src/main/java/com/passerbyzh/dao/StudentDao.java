package com.passerbyzh.dao;

import com.passerbyzh.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectAllStudents();
}
