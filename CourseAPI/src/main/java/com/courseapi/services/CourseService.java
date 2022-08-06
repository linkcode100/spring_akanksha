package com.courseapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapi.models.Course;
import com.courseapi.repositories.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		return courseRepository.findByTopicTopicId(topicId);
	}
	
	public Course getCourse(String topicId,String courseId) {
		return courseRepository.findByTopicTopicIdAndCourseId(topicId,courseId);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String courseId) {
		courseRepository.deleteById(courseId);
	}
}
