package com.uni.student.service;

import java.util.List;

import com.uni.student.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	boolean addStudent(Student student);

}
