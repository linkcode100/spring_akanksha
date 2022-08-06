package com.courseapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseapi.models.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

	List<Course> findByTopicTopicId(String topicId);

	Course findByTopicTopicIdAndCourseId(String topicId,String courseId);
}
