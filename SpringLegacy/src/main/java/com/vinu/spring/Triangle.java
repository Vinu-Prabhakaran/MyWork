package com.vinu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//ApplicationContextAware to get access to context variable created in main program
//BeanNameAware to get the name of the bean name
public class Triangle implements ApplicationContextAware,BeanNameAware{
	
	private String type;
	private int height;	
	ApplicationContext context;
	
	public Triangle(int height) {
		super();
		this.height = height;
	}


	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public Triangle(String type) {
		super();
		this.type = type;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getHeight() {
		return height;
	}


	public void draw() {
		System.out.println(this.getType()+" triangle Drawn of height "+this.getHeight());
	}
	
	// User Defined init . MOdify xml file to attach this method to the triangle bean.
	public void myInit() {
		System.out.println("myInit of triangle beean");
	}
	// User Defined destroy . MOdify xml file to attach this method to the triangle bean.
	public void myCleanup() {
		System.out.println("Cleanup of triangle beean");
	}


	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.context=context;
		
	}


	public void setBeanName(String beanName) {
		
		System.out.println("Bean name is "+beanName);
		
	}
}
