/**
 * 
 */
package com.vinu.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinu.spring.service.ShapeService;

/**
 * @author Vinu Prabhakaran
 *         on Jun 9, 2019
 *
 */
public class AopMain {


	public static void main(String[] args) {
		
		ApplicationContext cntxt=new ClassPathXmlApplicationContext("spring.xml");
	    ShapeService shapeService=cntxt.getBean("shapeService", ShapeService.class);
	    System.out.println(shapeService.getCircle().getName());
	    System.out.println(shapeService.getTriangle().getName());

	}

}
