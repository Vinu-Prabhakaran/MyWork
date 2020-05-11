/**
 * 
 */
package com.vinu.mockito.business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vinu.mockito.service.ToDoService;
import com.vinu.mockito.service.ToDoServiceStub;

/**
 * @author Vinu Prabhakaran
 *         on May 10, 2020
 *
 */
class ToDoBusinessImplTest {
	
	
	@Test
	@DisplayName("Test using stub")
	void testRetriveToDosRelatedToSpringUsingStub() {
		
		ToDoService toDoService = new ToDoServiceStub();
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoService);
		
		List<String> result = toDoBusinessImpl.retriveToDosRelatedToSpring("Vinu");
		assertEquals(2, result.size());
		
	}

}
