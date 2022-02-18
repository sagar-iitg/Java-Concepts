package com.minutes.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
				new Course(2, "Learn FullStack", "in28minutes"));

	}

	@GetMapping("/courses/1")
	public Course getCourseDetails() {
		return new Course(1, "Learn Microservices", "in28minutes");

	}

}
