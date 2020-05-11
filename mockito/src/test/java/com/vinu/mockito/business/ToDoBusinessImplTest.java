/**
 * 
 */
package com.vinu.mockito.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vinu.mockito.service.ToDoService;
import com.vinu.mockito.service.ToDoServiceStub;

/**
 * @author Vinu Prabhakaran
 *         on May 10, 2020
 *
 */
@ExtendWith(MockitoExtension.class)
class ToDoBusinessImplTest {
	
	@Mock
	ToDoService toDoMockService;
	
	@Test
	@DisplayName("Test using stub")
	void testRetriveToDosRelatedToSpringUsingStub() {
		
		ToDoService toDoService = new ToDoServiceStub();
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoService);
		
		List<String> result = toDoBusinessImpl.retriveToDosRelatedToSpring("Vinu");
		assertEquals(2, result.size());
		
	}
	
	@Test
	@DisplayName("Test using mock")
	void testRetriveToDosRelatedToSpringUsingMock() {
		
		//ToDoService toDoMockService = mock(ToDoService.class);
		when(toDoMockService.retrieveToDos("Vinu")).thenReturn(Arrays.asList("Learn Spring MVC", "Learn Spring","Learn to Dance"));
		when(toDoMockService.retrieveToDos("Dummy")).thenReturn(Arrays.asList());
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoMockService);
		List<String> result = toDoBusinessImpl.retriveToDosRelatedToSpring("Vinu");
		assertEquals(2, result.size());
		assertEquals(0, toDoBusinessImpl.retriveToDosRelatedToSpring("Dummy").size());
		
	}

}
