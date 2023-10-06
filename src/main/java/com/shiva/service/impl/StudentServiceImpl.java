package com.shiva.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.entity.Course;
import com.shiva.entity.Student;
import com.shiva.exception.StudentNotFound;
import com.shiva.repo.StudentRepository;
import com.shiva.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository stuRepo;
	@Override
	public String saveStudent(Student student) throws StudentNotFound  {
		// TODO Auto-generated method stub
		Student saveEnt = stuRepo.save(student);
		if(saveEnt!=null)
			return "Student is Registred Successfully";
		else
		throw new StudentNotFound("Student is Not Registred SuccessFully");
		
	}

	@Override
	public Course viewStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
