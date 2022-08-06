package com.courseapi.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Topic")
public class Topic {
	
	@Id
	private String topicId;
	@Column
	private String name;
	@Column
	private String description;
	
	@OneToMany(mappedBy = "topic")
	@JsonManagedReference(value="topic")
	private List<Course> courses;
	
	public Topic() {
		
	}

	public Topic(String topicId, String name, String description, List<Course> courses) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.description = description;
		this.courses = courses;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void setCourse(Course course) {
		courses.add(course);
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", name=" + name + ", description=" + description + ", courses=" + courses
				+ "]";
	}
	
	
}
