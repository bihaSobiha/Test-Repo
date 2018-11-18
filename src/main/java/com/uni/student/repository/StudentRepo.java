package com.uni.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uni.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
