package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

}
