/**
 * 
 */
package com.vinu.mockito.service;

import java.util.List;

/**
 * @author Vinu Prabhakaran
 *         on May 10, 2020
 *
 */
public interface ToDoService {
	
	public List<String> retrieveToDos(String user);
}

