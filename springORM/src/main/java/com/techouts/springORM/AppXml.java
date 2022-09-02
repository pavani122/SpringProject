package com.techouts.springORM;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techouts.springORM.dao.ProductDao;
import com.techouts.springORM.entities.Product;

public class AppXml {

	public static void main(String[] args) {

//		Resource r=new ClassPathResource("config.orm.xml");
//		BeanFactory factory=new XmlBeanFactory(r);
		ApplicationContext factory=new ClassPathXmlApplicationContext("config.orm.xml");
		ProductDao p=factory.getBean("productDao",ProductDao.class);
		Product product=new Product();
		product.setProductId(1);
		product.setProductName("Kurta");
		product.setProductPrice(599);
		p.save(product);
		System.out.println("success");
	}

}
