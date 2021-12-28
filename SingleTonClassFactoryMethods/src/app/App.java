package app;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test; 

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t = (Test)context.getBean("test");
		Test t1 = (Test)context.getBean("test");
		Calendar c = (Calendar)context.getBean("c");
		Calendar c1 = (Calendar)context.getBean("c");
		System.out.println(t==t1);
		System.out.println(c==c1);
	}

}
