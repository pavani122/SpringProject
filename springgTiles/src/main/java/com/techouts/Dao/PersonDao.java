package com.techouts.Dao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.techouts.springTiles.Person;

public class PersonDao {

    Person person;
    PersonDao personDao;
	private	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public Person save(Person p)
	{
		System.out.println(p);
		this.template.save(p);
		return p;
	}
    
	public void update(Person p)
	{
		this.template.update(p);
	}
	
	public void get(Person p)
	{
		p=personDao.save(p);
	}
	
	public void loadAll()
	{
		this.template.loadAll(Person.class);
	}
	public void delete(Person p)
	{
		this.template.delete(p);
	}
}
