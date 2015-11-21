package com.i2d23.saloon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller


public class WelcomeController {
	@RequestMapping("/index")
	public String indexHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "index";
	}
	
	@RequestMapping("/css3")
	public String css3Handler(Model model){
		model.addAttribute("message", "Hello World!");
		return "css3";
	}
	
	@RequestMapping("/eclipse")
	public String eclipseHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "eclipse";
	}
	@RequestMapping("/jsp")
	public String jspHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "jsp";
	}
	
	@RequestMapping("/github")
	public String githubHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "github";
	}
	
	@RequestMapping("/html5")
	public String html5Handler(Model model){
		model.addAttribute("message", "Hello World!");
		return "html5";
	}
	
	@RequestMapping("/java")
	public String javaHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "java";
	}
	
	@RequestMapping("/maven")
	public String mavenHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "maven";
	}
	
	@RequestMapping("/spring")
	public String springHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "spring";
	}
	
	@RequestMapping("/thymeleaf")
	public String thymeleafHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "thymeleaf";
	}
	
	@RequestMapping("/tiles-spring")
	public String tilesSpringHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "tiles-spring";
	}
	
	@RequestMapping("/tomcat")
	public String tomcatHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "tomcat";
	}
	@RequestMapping("/ubuntu")
	public String ubuntuHandler(Model model){
		model.addAttribute("message", "Hello World!");
		return "ubuntu";
	}
	
}
