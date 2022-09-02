package com.techouts.depSI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentSample 
{
    public static void main( String[] args )
    {
        ApplicationContext app=new ClassPathXmlApplicationContext(
        		"com/techouts/depSI/config.xml");
        Student student=(Student) app.getBean("student");    
        student.display();
        
    }
}
