/**
 * 
 */
package com.vinu.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @author Vinu Prabhakaran
 *         on Jun 6, 2019
 *
 */
public class DrawEvent extends ApplicationEvent {

	/**
	 * @param source
	 */
	public DrawEvent(Object source) {
		super(source);
		
	}

	@Override
	public String toString() {
		return("Draw Event Occured");
	}



}
