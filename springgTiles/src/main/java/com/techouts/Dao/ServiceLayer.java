package com.techouts.Dao;

public class ServiceLayer {

    private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void save()
	{
		personDao.save(null)
	}
		

}
