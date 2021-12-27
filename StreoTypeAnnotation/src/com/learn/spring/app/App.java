package com.learn.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.car.Car;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/learn/spring/resources/spring.xml");
		Car c =(Car)context.getBean(Car.class);
		c.printData();
		
	}

}
