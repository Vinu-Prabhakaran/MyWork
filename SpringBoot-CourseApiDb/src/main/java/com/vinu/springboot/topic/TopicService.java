package com.vinu.springboot.topic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//This is a static class
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	/*private List<Topic> topicList = new ArrayList<> (Arrays.asList(			// Generating a mutable ArrayList
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Core Java","CoreJava Description"),
			new Topic("JavaScript","JavaScript","JavaScript Description")
			));*/
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topicList=new ArrayList<>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	
	public Topic getTopic(String id){
		
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
	
		topicRepository.save(topic);	
	}

	public void updateTopic(String id,Topic topic) {
	
		topicRepository.save(topic);	// updates if already found.Else add it.
	}
	
	public void deleteTopic(String id) {
		
		topicRepository.deleteById(id);
	}
}
