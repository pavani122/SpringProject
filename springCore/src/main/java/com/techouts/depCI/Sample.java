package com.techouts.depCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/techouts/depCI/ci.config.xml");
		
//		Company cmpy=(Company)context.getBean("company");
//        cmpy.display();	
        
        Projects p=(Projects)context.getBean("projects");
        p.display();
	}

}
