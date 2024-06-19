package com.qedge.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qedge.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
