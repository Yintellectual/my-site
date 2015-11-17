package com.i2d23.saloon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller


public class WelcomeController {
	@RequestMapping("/welcome")
	public String welcomeHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "welcome";
	}
	
	@RequestMapping("/index")
	public String indexHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "index";
	}
	
}
