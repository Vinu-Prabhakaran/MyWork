/**
 * 
 */
package com.vinu.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Vinu Prabhakaran
 *         on Jun 6, 2019
 *
 */
@Component
public class MyEventListener implements ApplicationListener<ApplicationEvent> {

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ApplicationEvent event) {

		System.out.println(event.toString());
		
	}

}
