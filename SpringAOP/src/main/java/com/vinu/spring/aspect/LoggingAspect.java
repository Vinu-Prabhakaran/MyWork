/**
 * 
 */
package com.vinu.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Vinu Prabhakaran
 *         on Jun 10, 2019
 *
 */
@Aspect
//@Component
public class LoggingAspect {
	
	Long startTime;
	Long endTime;
	
	//@Before("execution(public String getName())")
	@Before("getNamePointCut()")
	public void LoggingAdvice() {
		startTime=System.currentTimeMillis();
		System.out.println("Logging Advice has run. Get method for name executed");
	}
	
	//@After("execution(public String getName())")
	@After("getNamePointCut()")
	public void LoggingTime() {
		endTime=System.currentTimeMillis();
		System.out.println("Time taken :"+ (endTime-startTime)+"ms");
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointCut() {
		
	}
	
	@Before("execution(public * get*())")
	public void LoggingAdviceWildCard() {
		
		System.out.println("Logging Advice configured with wildcard has run.");
	}
}
