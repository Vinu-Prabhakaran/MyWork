package com.vinu.springboot.topic;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return topicService.getAllTopics();
		/*List<Topic> topicList = Arrays.asList(
				new Topic("Spring","Spring Framework","Spring Framework Description"),
				new Topic("Java","Core Java","CoreJava Description"),
				new Topic("JavaScript","JavaScript","JavaScript Description")
				);
		return topicList;*/
	}
	
	@RequestMapping("/topics/{id}")
	//Tells content in {} is variable
	public Topic getTopic(@PathVariable String id){		//tells variable is same as what is there is path. If name is ot same
														// then use @PathVariable("varname")
		
		return topicService.getTopic(id);
		
	}
	
	//@RequestMapping(method=RequestMethod.POST,value="/topics")
	@PostMapping(value="/topics")			//Shortcut to above annotation
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@PathVariable String id,@RequestBody Topic topic) {
		topicService.updateTopic(id,topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		
		topicService.deleteTopic(id);
	}
}
