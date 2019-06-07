package com.vinu.spring;

import java.util.Arrays;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		//Triangle triangle = new Triangle();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		//AbstractApplicationContext let spring know when the bean is going to be destroyed.
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		//Triangle triangle = (Triangle)factory.getBean("triangle");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Quadrilateral quad=(Quadrilateral)context.getBean("quadrilateral");
		quad.draw();
		
		Triangle t2 = (Triangle) context.getBean("tri-alias");
		t2.draw();
		
		Pentagon p1= (Pentagon) context.getBean("pentagon");
		p1.draw();
		
		System.out.println("Now lets draw by coding to Interface Shape");
		Shape shape=(Shape) context.getBean("circle");
		shape.draw();
		
		shape= (Shape) context.getBean("quadrilateral");
		shape.draw();
	}
	
}
