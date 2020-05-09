/**
 * 
 */
package com.vinu.junit5.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * @author Vinu Prabhakaran
 *         on May 5, 2020
 *
 */
@TestInstance(Lifecycle.PER_CLASS)
 class MathUtilsTest {
	 
	MathUtils mathUtil;
	
	public MathUtilsTest() {
		super();
		System.out.println("Creating MathUtil instance");
	}
	
	@BeforeAll
	void beforeAll() {
		System.out.println("beforeAll ...");
	}
	@BeforeEach
	void init(){
		
		mathUtil=new MathUtils();
	}
	/**
	 * Test method for {@link com.vinu.junit5.basics.MathUtils#add(int, int)}.
	 */
	@Test
	@DisplayName("Test add method")
	void testAdd() {

		assertEquals(2, mathUtil.add(1, 1), "Add Test#1 failed");
	}
	
	@Test
	void testComputeCircleArea() {
		
		assertEquals(314.1592653589793, mathUtil.computeCircleArea(10));
		
	}
	
	@Test
	void testDivide() {

		assertThrows(ArithmeticException.class, () -> mathUtil.divide(2, 0),"Division By Zero should return ArithmeticException");
		assertEquals(2,mathUtil.divide(10, 5),"Division gave wrong value");
	}
	
	@Test
	@DisplayName("TDD method. Don't run")
	@Disabled
	void tddMethod() {
		fail("This is a Test Driven Development method.");
	}
}
