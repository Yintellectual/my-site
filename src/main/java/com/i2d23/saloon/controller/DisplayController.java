package com.i2d23.saloon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriUtils;

import com.i2d23.saloon.beans.Article;
import com.i2d23.saloon.beans.Technology;
import com.i2d23.saloon.dao.ArticleDao;
import com.i2d23.saloon.dao.TechnologyDao;

@Controller
public class DisplayController {
	@Autowired
	private ApplicationContext appContext;

	@RequestMapping("/index")
	public String indexHandler() {
		return "index";
	}
	
	@RequestMapping("/Access_Denied")
	public String accessDeniedHandleer(){
		return "accessDenied";
	}
	
	@RequestMapping("/technology/{name}")
	public String technologyHandler(@PathVariable String name, Model model) {
		TechnologyDao technologyDao = (TechnologyDao) appContext.getBean("technologyDaoImp");
		List<Technology> technologyList = technologyDao.list();
		Technology technology = null;
		for (Technology t : technologyList) {
			if (t.getName().equals(name))
				technology = t;
		}
		model.addAttribute("technology", technology);
		return "technology";
	}

	@RequestMapping("/article/{name}")
	public String articleHandler(@PathVariable("name") String name, Model model) {

		String title = null;
		try {
			title = UriUtils.decode(name, "utf-8");
		} catch (Exception e) {
			System.out.println(e);
		}
		if (title == null)
			return "article not found";
		else {
			ArticleDao articleDao = (ArticleDao) appContext.getBean("articleDaoImp");
			List<Article> articleList = articleDao.list();
			Article article = null;
			for (Article a : articleList) {
				if(title.equals(a.getTitle())){
					article = a;
					model.addAttribute("article", article);
					return "article";
				}
			}
		}
		return "article not found";
	}
}
