package com.techouts.springORM.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.techouts.springORM.entities.Product;
//@Transactional
public class ProductDao {

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	public void save(Product p)
	{
		this.template.save(p);
	}
	
	public void update(Product p)
	{
		this.template.update(p);
	}
	
	public Product get()
	{
		Product product=this.template.get(Product.class,1);
		return product;
	}
	
	public Product load() {
		Product product=this.template.load(Product.class, 2);
		//System.out.println(product.getProductId()+":"+product.getProductName());
		return product;
	}
    
	public List<Product> loadAllObjs() {
		
	    List<Product> list=this.template.loadAll(Product.class);
		return list;
	}
}
