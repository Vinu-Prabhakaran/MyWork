/**
 * 
 */
package com.vinu.junit5.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Vinu Prabhakaran
 *         on May 5, 2020
 *
 */
 class MathUtilsTest {

	/**
	 * Test method for {@link com.vinu.junit5.basics.MathUtils#add(int, int)}.
	 */
	@Test
	void testAdd() {

		MathUtils mathUtil=new MathUtils();
		assertEquals(2, mathUtil.add(1, 1), "Add Test#1 failed");
	}
	
	@Test
	void testComputeCircleArea() {
		
		MathUtils mathUtil=new MathUtils();
		assertEquals(314.1592653589793, mathUtil.computeCircleArea(10));
		
	}
	
	@Test
	void testDivide() {

		MathUtils mathUtil=new MathUtils();
		try {
			mathUtil.divide(2, 0);
		}catch (Exception e) {
			assertTrue(e instanceof ArithmeticException,"Division By Zero should throw ArithMatic exception.");
		}
		assertEquals(2,mathUtil.divide(10, 5),"Division gave wrong value");
	}
}
