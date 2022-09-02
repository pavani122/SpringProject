package com.techouts.springORM;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techouts.springORM.dao.ProductDao;
import com.techouts.springORM.entities.Product;

public class App 
{
    public static void main( String[] args )
    {
    	Product p;
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.orm.xml");
        ProductDao daoObj=context.getBean("productDao",ProductDao.class);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter productName:");
        String productName=sc.next();
        System.out.println("Enter productPrice:");
        float productPrice=sc.nextFloat();
        //To save data
        daoObj.save(new  Product(productName, productPrice));
        //To update data
 //       daoObj.update(new Product(2, productName, productPrice));
        //To fetch data
//        p=daoObj.get();
//        System.out.println("Details of product using get():");
//        System.out.println(p.getProductId()+":"+p.getProductName()+":"+p.getProductPrice());
//        
//        Product p1=daoObj.load();
//        System.out.println("Details of product using load():");
//        System.out.println(p.getProductId()+":"+p.getProductName()+":"+p.getProductPrice());
//        
//        List<Product> list=daoObj.loadAllObjs();
//        for(Product pro:list)
//        {
//        	System.out.println(pro.getProductId()+":"+pro.getProductName()+":"+pro.getProductPrice());
//        }
        	
        System.out.println("success");
        
      
        
    }
}
