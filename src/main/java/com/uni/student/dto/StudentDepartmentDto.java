package com.uni.student.dto;

public class StudentDepartmentDto {

	private Integer id;
	private String name;
	private Integer yearOfStudy;
	private String department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
