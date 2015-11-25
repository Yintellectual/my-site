package com.i2d23.saloon.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.i2d23.saloon.dao.BeanDaoImp;
import com.i2d23.saloon.dao.PostDaoImp;
import com.i2d23.saloon.dao.TechnologyDaoImp;
import com.i2d23.saloon.beans.Technology;
import com.i2d23.saloon.dao.ArticleDaoImp;
import com.i2d23.saloon.beans.Article;
@Controller
@RequestMapping("/upload")
public class UploadController implements ApplicationContextAware{

	
	private ApplicationContext appContext;

	@RequestMapping("/form/technology")
	public String formTechnology(Model model) {
		model.addAttribute("user",getPrincipal());
		return "/upload/form/technology";
	}
	@RequestMapping(value = "/confirm/technology", method = RequestMethod.POST)
	public String confirmTechnology(Model model) {
		model.addAttribute("user",getPrincipal());
		return "/upload/confirm/technology";
	}
	@RequestMapping(value = "/success/technology", method = RequestMethod.POST)
	public String successTechnology(HttpSession session, Model model) {
		model.addAttribute("user",getPrincipal());
		Technology technology = (Technology) session.getAttribute("technology");
		TechnologyDaoImp technologyDaoImp = (TechnologyDaoImp) appContext.getBean("technologyDaoImp");
		technologyDaoImp.save(technology);
		return "/upload/success/technology";
	}
	
	@RequestMapping("/form/article")
	public String formArticle(Model model) {
		model.addAttribute("user",getPrincipal());
		return "/upload/form/article";
	}
	@RequestMapping(value = "/confirm/article", method = RequestMethod.POST)
	public String confirmArticle(Model model) {
		model.addAttribute("user",getPrincipal());
		return "/upload/confirm/article";
	}
	@RequestMapping(value = "/success/article", method = RequestMethod.POST)
	public String successArticle(HttpSession session, Model model) {
		model.addAttribute("user",getPrincipal());
		Article article = (Article) session.getAttribute("article");
		ArticleDaoImp articleDaoImp = (ArticleDaoImp) appContext.getBean("articleDaoImp");
		articleDaoImp.save(article); 
		return "/upload/success/article";
	}
	
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		appContext = arg0;
		
	}
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
	
}
