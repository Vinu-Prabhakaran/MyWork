/**
 * 
 */
package com.vinu.mockito.business;

import java.util.List;
import java.util.stream.Collectors;

import com.vinu.mockito.service.ToDoService;

/**
 * @author Vinu Prabhakaran
 *         on May 10, 2020
 *
 */
public class ToDoBusinessImpl {
	
	
	private ToDoService toDoService;
	
	
	public ToDoBusinessImpl(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}

	public List<String> retriveToDosRelatedToSpring(String user){
		
		List<String> allToDos= toDoService.retrieveToDos(user);
		List<String> filteredToDos=allToDos.stream()
										   .filter(t -> t.contains("Spring"))
										   .collect(Collectors.toList());
		return filteredToDos;
	}

}
