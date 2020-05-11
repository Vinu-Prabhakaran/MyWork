/**
 * 
 */
package com.vinu.mockito.service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vinu Prabhakaran
 *         on May 10, 2020
 *
 */
public class ToDoServiceStub implements ToDoService {

	
	@Override
	public List<String> retrieveToDos(String user) {
		
		return (Arrays.asList("Learn Spring MVC", "Learn Spring","Learn to Dance"));
	}
	
	
}
