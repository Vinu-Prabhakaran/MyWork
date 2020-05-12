/**
 * 
 */
package com.vinu.mockito.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vinu.mockito.service.ToDoService;
import com.vinu.mockito.service.ToDoServiceStub;

/**
 * @author Vinu Prabhakaran
 *         on May 10, 2020
 *
 */
class ToDoBusinessImplTest {
	
	@Mock
	ToDoService toDoMockService;
	
	@InjectMocks
	ToDoBusinessImpl toDoBusinessImpl;
	
	@BeforeEach
	public void setup() {
	    MockitoAnnotations.initMocks(this);
	}
	
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
		//ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoMockService);
		List<String> result = toDoBusinessImpl.retriveToDosRelatedToSpring("Vinu");
		assertEquals(2, result.size());
		assertEquals(0, toDoBusinessImpl.retriveToDosRelatedToSpring("Dummy").size());
		
	}
	
	@Test
	@DisplayName("Test using BDDmock")
	void testRetriveToDosRelatedToSpringUsingBddMock() {
		
		//Given
		given(toDoMockService.retrieveToDos("Vinu")).willReturn(Arrays.asList("Learn Spring MVC", "Learn Spring","Learn to Dance"));
		//When
		List<String> result = toDoBusinessImpl.retriveToDosRelatedToSpring("Vinu");
		//Then
		assertThat(result.size(),is(2));
		
	}

}
