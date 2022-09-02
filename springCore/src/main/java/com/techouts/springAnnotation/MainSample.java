package com.techouts.springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSample {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("config.xml");
		College college=(College)context.getBean("college",College.class);
		System.out.println(college);
		
	}

}
