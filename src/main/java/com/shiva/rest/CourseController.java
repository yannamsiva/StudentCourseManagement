package com.shiva.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.entity.Course;
import com.shiva.exception.StudentNotFound;
import com.shiva.service.impl.CourseServiceImpl;

@RestController
public class CourseController {
	@Autowired
	CourseServiceImpl daoService;
	
@PostMapping("/course")
	public ResponseEntity<String> createCourse(@Valid   @RequestBody  Course course)
	{
		String msg=null;
		String saveEnt = daoService.saveCourse(course);
		if(saveEnt!=null)
			 msg = "Registred Course SuccessFully";
			 else
			msg="Data is not Registred";
		
		
		return ResponseEntity.ok().body(msg);
	}
	
	
}
