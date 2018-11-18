package com.uni.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.student.entity.Student;
import com.uni.student.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired 
	StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
		
	}

	@Override
	public boolean addStudent(Student student) {
		 studentRepo.save(student);
		 return true;
	}

}
