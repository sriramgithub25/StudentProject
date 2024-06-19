package com.qedge.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.qedge.student.model.Student;
import com.qedge.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	public void deleteStudent(String stuId) {
	Integer sId = Integer.valueOf(stuId);
	repository.deleteById(sId);
		
	}

	public void saveOrUpdateStudent(Student st) {
		repository.save(st);
		
	}

	public Student getStudent(String stuId) {
		Integer sId = Integer.valueOf(stuId);
		Student st = repository.findById(sId).get(); 
		return st;
	}
}
