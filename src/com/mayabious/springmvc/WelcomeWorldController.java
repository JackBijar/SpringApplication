package com.mayabious.springmvc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class WelcomeWorldController 
{
	@RequestMapping("/welcome")
	
	public ModelAndView welcomeWorld()
	{
		String message = "Welcom SPRING MVC 3";
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		
		return new ModelAndView("welcomepage", "message", df.format(dateobj));
	}
}
