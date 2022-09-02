package com.techouts.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/techouts/aop/config.aop.xml");
		PaymentService service=(PaymentService)context.getBean("payment");
		service.pay();
		service.m();
		service.k();
	}

}
