/**
 * Test Class for MathUtils
 */
package com.vinu.junit5.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
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
	@Nested
	@Tag(value="Math")
	class AddTest{
		@Test
		@DisplayName("Test add method")
		void testAdd() {
	
			assertEquals(0, mathUtil.add(1, -1), "Add +ve and -ve failed");
		}
		@Test
		@DisplayName("Test add method for +ve")
		void testAddPositive() {
	
			assertEquals(3, mathUtil.add(2, 1), "Add +ve and +ve failed");
		}
		@Test
		@DisplayName("Test add method for -ve")
		void testAddNegative() {
	
			assertEquals(-2, mathUtil.add(-1, -1), "Add -ve and -ve failed");
		}
	}
	
	@Test
	@Tag(value="Math")
	@DisplayName("Test divide method")
	void testDivide() {

		assertThrows(ArithmeticException.class, () -> mathUtil.divide(2, 0),"Division By Zero should return ArithmeticException");
		assertEquals(2,mathUtil.divide(10, 5),() -> "Division gave wrong value");
	}
	
	@Test
	@Tag(value="Math")
	@DisplayName("TDD method. Don't run")
	@Disabled
	void tddMethod() {
		fail("This is a Test Driven Development method.");
	}
	
	@Test
	@Tag(value="Math")
	@DisplayName("Test multiply method")
	void testMultiply() {
		
		assertAll("All tests for multiply",
				() -> assertEquals(2, mathUtil.multiply(2, 1)),
				() -> assertEquals(4, mathUtil.multiply(2, 2)),
				() -> assertEquals(-6, mathUtil.multiply(2,-3))
				);
	}
	
	@RepeatedTest(value=3)
	@Tag(value="Circle")
	//@RepeatedTest(3)
	@DisplayName("Test circleArea method")
	void testComputeCircleArea(RepetitionInfo repetitionInfo) {
		
		int i=repetitionInfo.getCurrentRepetition();
		switch (i) {
		case 1:
			assertEquals(314.1592653589793, mathUtil.computeCircleArea(10));
			break;
		case 2:
			assertEquals(0, mathUtil.computeCircleArea(0));
			break;
		case 3:
			assertEquals(3.141592653589793, mathUtil.computeCircleArea(1));
			break;
		default:
		}	
	}
}
