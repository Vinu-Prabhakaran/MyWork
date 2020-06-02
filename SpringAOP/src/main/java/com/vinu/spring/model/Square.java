/**
 * 
 */
package com.vinu.spring.model;

import org.springframework.stereotype.Component;

/**
 * @author Vinu Prabhakaran
 *         on Jun 1, 2020
 *
 */
@Component
public class Square {
	
	private String name;
	private int sides;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}

}
