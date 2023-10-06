package com.shiva.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shiva.entity.Course;
import com.shiva.repo.CourseRepository;
import com.shiva.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepo;
	@Override
	public String saveCourse(Course cou) {
		// TODO Auto-generated method stub
		Course course = courseRepo.save(cou);
		String msg="";
		if(course!=null)
		{
			msg="Course REgistred Successfully";
		}
		else
			msg="Course not REgistred Successfully";

		return msg;
	}

	@Override
	public Course viewCourse(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String deleteCourse(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
