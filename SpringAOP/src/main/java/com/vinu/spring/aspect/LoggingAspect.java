/**
 * 
 */
package com.vinu.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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
		System.out.println("Logging Advice has run. Get method for name executed");
	}
	
	//@After("execution(public String getName())")
	@After("getNamePointCut()")
	public void afterAdvice() {
		System.out.println("Advice after getName");
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointCut() {
		
	}
	//POint cut for all methods within Circle class.
	@Pointcut("within(com.vinu.spring.model.Circle)")
	public void allCircleMethods() {
		
	}
	@Before("allCircleMethods()")
	public void LoggingAdviceWithin() {
		
		System.out.println("Logging Advice for all methods in Circle.");
	}
	
	@Before("execution(public * get*())")
	public void LoggingAdviceWildCard() {
		
		System.out.println("Logging Advice configured with wildcard has run.");
	}
	
	@Before("args(name)")
	public void LoggingAdviceForStringArg(String name) {
		startTime=System.currentTimeMillis();
		System.out.println("Advice has run for a method with String argument "+name);
	}
	
	//Advice for any setter
	@Before("execution( * set*(..))")
	public void anySetter(JoinPoint jP) {
		
		System.out.println("Target Object :"+jP.getTarget()+" Target method :"+jP+" or "+jP.toShortString()+" or "+jP.toLongString());
	}
	
	@AfterReturning(pointcut="args(name)",returning="returnObject")
	public void anyStringArgStringReturnMethod(String name,String returnObject) {
		
		System.out.println("Method takes in arg "+name+" and returns "+returnObject);
	}
	
	//@Around("getNamePointCut()")
	@Around("@annotation(com.vinu.spring.annotation.Loggable)")
	public Object LoggingTime(ProceedingJoinPoint proceedingJoinPoint) {
		Long startTime = null;
		Object returnValue=null;
		
		try {
			System.out.println("@Around Before "+proceedingJoinPoint.getSignature());
			startTime=System.currentTimeMillis();
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("@Around AfterReturning"+proceedingJoinPoint.getSignature());
		} catch (Throwable e) {
			System.out.println("@Around AfterThrowing");
		}
		System.out.println("@Around Finally");
		System.out.println("ExecutionTime for "+proceedingJoinPoint.getSignature()+" is "+(System.currentTimeMillis() - startTime));
		return returnValue;
	}

}
