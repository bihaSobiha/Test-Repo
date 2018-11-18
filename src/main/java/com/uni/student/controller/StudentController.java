package com.uni.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uni.student.entity.Student;
import com.uni.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public List<Student> viewStudent(){
		return studentService.getAllStudent();
	}
	
	@PatchMapping
	public HttpStatus createStudent(Student student) {
		if(studentService.addStudent(student)) {
			return HttpStatus.CREATED;
		}
		else {
			return HttpStatus.BAD_REQUEST;
		}
		
	}
}
