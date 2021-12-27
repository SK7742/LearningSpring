package com.learn.spring.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.spring.engine.Engine;

@Component
public class Car {
	@Autowired
	private Engine engine;
	public void printData() {
		System.out.println("Engine Name: "+ engine.getEngineName());
	}
}
