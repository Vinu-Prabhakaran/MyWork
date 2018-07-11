package com.vinu.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		List<Topic> topicList = Arrays.asList(
				new Topic("Spring","Spring Framework","Spring Framework Description"),
				new Topic("Java","Core Java","CoreJava Description"),
				new Topic("JavaScript","JavaScript","JavaScript Description")
				);
		return topicList;
	}
}
