package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override


    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
     return studentRepository.save(student);
    }
}
