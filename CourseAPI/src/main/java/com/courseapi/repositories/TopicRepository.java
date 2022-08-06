package com.courseapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseapi.models.Topic;

public interface TopicRepository extends JpaRepository<Topic, String> {

	Topic findByTopicId(String topicId);
}
