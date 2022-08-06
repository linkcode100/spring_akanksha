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

import com.courseapi.models.Topic;
import com.courseapi.request.TopicRequest;
import com.courseapi.services.TopicService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/hello")
	public String syHello() {
		return "Hello Spring";
	}

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{topicId}")
	public Topic getTopic(@PathVariable("topicId") String topicId) {
		return topicService.getTopic(topicId);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{topicId}")
	public String updateTopic(@PathVariable("topicId") String topicId,@RequestBody TopicRequest topicRequest) {
		Topic topic1=topicService.getTopic(topicId);
		if(topic1==null) {
			return "Topic does not exist";
		}else {
			topic1.setName(topicRequest.getFirstname()+" "+topicRequest.getLastname());
			topic1.setDescription(topicRequest.getDescription());
			topicService.updateTopic(topic1);
			return "Topic Updated";
		}
	}
	
	@DeleteMapping("/topics/{topicId}")
	public void deleteTopic(@PathVariable("topicId") String topicId) {
		topicService.deleteTopic(topicId);
	}
}
