package com.mayabious.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloWorldController 
{
	@RequestMapping("/hello")
	
	public ModelAndView helloWorld() 
	{  
        String message = "Welcome to Spring MVC"; 
        System.out.println("Hey... I am in Hello Controller");
        return new ModelAndView("hellopage", "message", message);  
    }  	
}
