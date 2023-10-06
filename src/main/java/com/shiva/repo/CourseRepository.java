package com.shiva.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiva.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

}
