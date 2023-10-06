package com.shiva.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiva.entity.Course;
import com.shiva.entity.Student;
import com.shiva.exception.StudentNotFound;

public interface StudentService {

	public String saveStudent(Student student) throws StudentNotFound;
	public Course viewStudent(Integer id);
	public String updateStudent(Student student);
	public String deleteStudent(Integer id);
}
