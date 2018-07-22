package com.vinu.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
//This is a static class
public class TopicService {
	
	private List<Topic> topicList = new ArrayList<> (Arrays.asList(			// Generating a mutable ArrayList
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Core Java","CoreJava Description"),
			new Topic("JavaScript","JavaScript","JavaScript Description")
			));
	
	public List<Topic> getAllTopics(){
		
		return topicList;
	}
	
	public Topic getTopic(String id){
		
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
	
		topicList.add(topic);	
	}

	public void updateTopic(String id,Topic topic) {
	
		for(int i=0;i<topicList.size();i++) {
			if(topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
			}
		}
	}
	
	public void deleteTopic(String id) {
		
		topicList.removeIf(t -> t.getId().equals(id));
	}
}
