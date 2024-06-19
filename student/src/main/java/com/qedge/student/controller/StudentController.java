package com.qedge.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qedge.student.model.Student;
import com.qedge.student.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("/getAllStudents")
	public ModelAndView getAllStudents() {
		return findAllStudents();
	}
	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent(HttpServletRequest request) {
		String stuId = request.getParameter("stu_id");
		service.deleteStudent(stuId);
		return findAllStudents();
		
	}
	@RequestMapping("/addStudent")
	public ModelAndView addStudent() {
		ModelAndView mv = new ModelAndView("add_student");
		return mv;
	}
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(HttpServletRequest request) {
		Student st = prepareStudent(request);
		service.saveOrUpdateStudent(st);
		return findAllStudents();
	}
	@RequestMapping("/editStudent")
	public ModelAndView editStudent(HttpServletRequest request) {
		String stuId = request.getParameter("stu_id");
		Student st = service.getStudent(stuId);
		ModelAndView mv = new ModelAndView("edit_student","st",st);
		return mv;
	}
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(HttpServletRequest request) {
		Student st =prepareStudent(request);
		String stuId = request.getParameter("stu_id");
		st.setStuId(Integer.valueOf(stuId));
		service.saveOrUpdateStudent(st);
		return findAllStudents();
	}
	private Student prepareStudent(HttpServletRequest request) {
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		Student st =  new Student(firstName,lastName);
		return st;
	}
	private ModelAndView findAllStudents() {
		List<Student>allStudents = service.getAllStudents();
		ModelAndView mv = new ModelAndView("all_students","students",allStudents);
		return mv;
	}
}
