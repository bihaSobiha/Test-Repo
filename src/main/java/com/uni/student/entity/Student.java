package com.uni.student.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1606367225893199692L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer Id;
	private String name;
	private Integer yearOfStudy;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JsonIgnoreProperties("student")
	private Department department;
	

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(Integer yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
