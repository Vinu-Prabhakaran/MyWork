/**
 * 
 */
package com.vinu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/**
 * @author Vinu Prabhakaran
 *         on May 21, 2019
 *
 */
public class Circle implements Shape {
	
	private Point pointA;
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("circle.message", null, "Default Message to Draw Circle", null));
		/*System.out.println("Circle drawn with center at ("+
	    this.getPointA().getX()+","+this.getPointA().getY()+")"); */
		System.out.println(this.messageSource.getMessage("circle.point", new Object[] {this.getPointA().getX(), this.getPointA().getY()},"Default Circle point Message", null));
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

}
