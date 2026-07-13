package com.josh.assignment9springdatajpaactuator.service;

import com.josh.assignment9springdatajpaactuator.entity.Student;
import com.josh.assignment9springdatajpaactuator.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }
}
