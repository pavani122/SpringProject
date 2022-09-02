package com.techouts.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
//	@Before("execution(* com.techouts.aop.PaymentServiceImplement.pay())")
//	public void getInfo()
//	{
//		System.out.println("...pay....");
//	}
//    @After("execution(* com.techouts.aop.PaymentServiceImplement.pay())")
//	public void gotInfo()
//	{
//		System.out.println("...paid....");
//	}
    @Pointcut("execution(* PaymentServiceImplement.*(..))")
    public void k()
    {
    	
    }

    public void beforeK(Joinpoint jp)
    {
    	System.out.println("...............");
    }
}
