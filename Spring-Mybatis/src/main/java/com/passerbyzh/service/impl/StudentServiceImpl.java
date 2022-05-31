package com.passerbyzh.service.impl;

import com.passerbyzh.dao.StudentDao;
import com.passerbyzh.domain.Student;
import com.passerbyzh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    // 引用类型
    @Autowired
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> queryStudent() {
        return studentDao.selectAllStudents();
    }
}
