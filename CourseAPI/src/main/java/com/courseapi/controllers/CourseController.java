package com.courseapi.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courseapi.models.Course;
import com.courseapi.services.CourseService;
import com.courseapi.services.TopicService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
	
	@Autowired
	private TopicService topicService;
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable("topicId") String topicId) {
		return courseService.getAllCourses(topicId);
	}
	
	@GetMapping("/topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable("topicId") String topicId,@PathVariable("courseId") String courseId) {
		return courseService.getCourse(topicId,courseId);
	}
	
	@PostMapping("/topics/{topicId}/courses")
	public void addCourse(@PathVariable("topicId") String topicId,@RequestBody Course course) {
		course.setTopic(topicService.getTopic(topicId));
		courseService.addCourse(course);
	}
	
	@PutMapping("/topics/{topicId}/courses/{courseId}")
	public void updateTopic(@PathVariable("topicId") String topicId,@PathVariable("courseId") String courseId,@RequestBody Course course) {
		course.setTopic(topicService.getTopic(topicId));
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("/topics/{topicId}/courses/{courseId}")
	public void deleteTopic(@PathVariable("courseId") String courseId) {
		courseService.deleteCourse(courseId);
	}
}
