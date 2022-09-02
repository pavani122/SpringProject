package com.techouts.add;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public class SampleController {
    
	//using @RequestParam
		@RequestMapping("/signin")
		public String login(@RequestParam("username") String name,
				@RequestParam("userpassword") String password,
				Model model)
		{
			System.out.println("........");
			model.addAttribute("name", name);
			model.addAttribute("password", password);
			System.out.println("..............");
			return "welcome";
		}
		
		@RequestMapping(path = "/signin",method = RequestMethod.POST)
		public String log(@ModelAttribute User user,Model model)
		{
			System.out.println(user+"......");
			//model.addAttribute("user",user);
			model.addAttribute(user);
			return "welcome";
		}	
	
		
	
}
