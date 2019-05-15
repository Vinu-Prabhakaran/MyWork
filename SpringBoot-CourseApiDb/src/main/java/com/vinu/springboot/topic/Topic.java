package com.vinu.springboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value="Topic Data Model")
public class Topic {
	
	@Id
	@ApiModelProperty(value="TopicID",required=true,position=1)
	private String id;
	@ApiModelProperty(value="Topic Name",position=2)
	private String name;
	@ApiModelProperty(value="Description of Topic",position=3)
	private String description;
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
}
