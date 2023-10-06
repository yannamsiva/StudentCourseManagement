package com.shiva.service;

import com.shiva.entity.Course;

public interface CourseService {
public String saveCourse(Course course);
public Course viewCourse(Integer id);
public String updateCourse(Course course);
public String deleteCourse(Integer id);

}
