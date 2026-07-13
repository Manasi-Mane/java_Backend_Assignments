package com.josh.assignment9springdatajpaactuator.repository;
import com.josh.assignment9springdatajpaactuator.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long>{
}