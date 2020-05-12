/**
 * 
 */
package com.vinu.mockito.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * @author Vinu Prabhakaran
 *         on May 11, 2020
 *
 */
class ListTest {
	
	@Mock
	List<String> mockList;
	
	@BeforeEach
	public void setup() {
	    MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testListSize() {
		
		when(mockList.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, mockList.size());
		assertEquals(3, mockList.size());
	}
	
	@Test
	void testGetMethod() {
		
		when(mockList.get(0)).thenReturn("Vinu");
		assertThat(mockList.get(0).length(),is(4));
		when(mockList.get(anyInt())).thenReturn("Ramya");
		assertThat(mockList.get(0).length(),is(5));
	}

}
