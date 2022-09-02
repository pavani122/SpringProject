package com.techouts.auto.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSample {

	public static void main(String[] args) {

		 ApplicationContext context= new ClassPathXmlApplicationContext(
		 		 "com/techouts/auto/wiring/config.xml");
          Student s=(Student)context.getBean("student");
          System.out.println(s);
	}

}
