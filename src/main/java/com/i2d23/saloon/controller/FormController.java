package com.i2d23.saloon.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.i2d23.saloon.dao.PostDaoImp;
import com.i2d23.saloon.beans.Post;
@Controller
public class FormController implements ApplicationContextAware{
	  
	  private ApplicationContext appContext;
	
	@RequestMapping(value="/oooupload", method=RequestMethod.GET)
	public String upload(Model model,HttpSession session){
		model.addAttribute("upload", "uploading!");
		return "upload";
	}

	@RequestMapping(value="/confirmUpload", method=RequestMethod.POST)
	public String confirmUpload(Model model,HttpSession session){
		return "confirmUpload";
	}
	
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String success(Model model,HttpSession session){
		model.addAttribute("success", "Successed!");
		Post p = (Post) session.getAttribute("post");
		System.out.println(p);
		
		PostDaoImp postDaoImp = (PostDaoImp)appContext.getBean("postDaoImp");
		postDaoImp.save(p);
		return "success";
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		appContext = arg0;
		
	}
}
