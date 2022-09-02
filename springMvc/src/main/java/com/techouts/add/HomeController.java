package com.techouts.add;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String getMessage(HttpServletRequest request,Model model)
	{
		
		System.out.println("haiiii");
		String username=request.getParameter("username");
		String password=request.getParameter("userpassword");
		System.out.println(username);
		System.out.println(password);
		if(password.equals("12345678"))
		{
            model.addAttribute("name",username);
            model.addAttribute("password", password);
		    return "welcome";
		}
		else
		{
            model.addAttribute("name",username);
			return "error";
		}
	}
}
