/**
 * 
 */
package com.vinu.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinu.spring.model.Circle;
import com.vinu.spring.model.Triangle;

/**
 * @author Vinu Prabhakaran
 *         on Jun 10, 2019
 *
 */
//@Service
public class ShapeService {
	
	//@Autowired
	private Circle circle;
	//@Autowired
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
