package com.courseapi.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Course")
public class Course {
	
	@Id
	private int id;
	@Column
	private String courseId;
	@Column
	private String name;
	@Column
	private String description;
	
	@ManyToOne
	@JsonBackReference(value="topic")
	private Topic topic;
	
	public Course() {
		
	}

	public Course(int id, String courseId, String name, String description, Topic topic) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		this.topic = topic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
