package com.techouts.add;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {

	@RequestMapping("/")
	public String index()
	{
	return "index";
	}
	@RequestMapping("/formOne")
	public String form(Model model)
	{
		System.out.println("DemoController");
		User user=new  User();
		model.addAttribute("user", user);
		return "formtag";
	}
	
	//using @ModelAttribute
	
			@RequestMapping(path = "/signin")
			public String login(@Valid @ModelAttribute("user") User user,BindingResult result,Model model)
			{
				if(result.hasErrors())
				{
					System.out.println(result.hasErrors());
					return "formtag";
				}
				else
				{
				System.out.println("DemoController");
				model.addAttribute(user);

				System.out.println(user);
				
				return "welcome";
				}
			}
}
