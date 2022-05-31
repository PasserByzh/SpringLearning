package com.passerbyzh.service;

import com.passerbyzh.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudent();
}
