package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/display")
	public String display()
	{
		System.out.println("hey guys, Application is running");
		return "display.jsp";
		
	}
	
	

}
