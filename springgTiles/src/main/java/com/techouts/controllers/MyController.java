package com.techouts.controllers;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.techouts.Dao.PersonDao;
import com.techouts.springTiles.Person;

@Controller
public class MyController {
	
	Person p;
	
	@Autowired
	PersonDao personDao;
    
	@RequestMapping("/register")
	public String register(Model model)
	{
		Person person=new Person();
		model.addAttribute("person", person);
		return "register";
	}
	
	@RequestMapping("/registered")
	@Transactional
	public ModelAndView login(@ModelAttribute("person") Person person,ModelAndView model)
	{
	   this.p=personDao.save(person);
	   model.addObject(person);
	   model.setViewName("registered");
       return model ;
	}
	
	@RequestMapping("/loggingin")
	public String loggingin()
    {
		
		return "login";
	}
	
	
	@RequestMapping("/welcome")
	public String home(Model model,@RequestParam("name") String name,@RequestParam("password") String password)
	{
		if(this.p.equals(null))
		{
			return "register";
		}
		else
		{
		if(password.equals(p.getPassword()))
		{
		model.addAttribute(p);
		System.out.println("welcome "+p);
		return "welcome";
		
		}
		else
		{
			return "error";
		}
		}
	}
	
	@RequestMapping("/logout")
	public String logout()
	{
		return "logout";
	}
	
}
