package com.courseapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapi.models.Topic;
import com.courseapi.repositories.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String topicId) {
		return topicRepository.findByTopicId(topicId); 
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String topicId) {
		topicRepository.deleteById(topicId);
	}
}
