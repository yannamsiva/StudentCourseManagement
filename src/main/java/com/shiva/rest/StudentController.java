package com.shiva.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.entity.Student;
import com.shiva.exception.StudentNotFound;
import com.shiva.service.impl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl daoService;
	
@PostMapping("/stu")
	public ResponseEntity<String> createStudent(@Valid   @RequestBody  Student stu)
	{
		String msg=null;
		try {
			 msg = daoService.saveStudent(stu);
		} catch (StudentNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg="Data is not Registred";
		}
		
		return ResponseEntity.ok().body(msg);
	}
	
	
}
