package com.i2d23.saloon.dao;

import java.util.List;

import com.i2d23.saloon.beans.Article;


public interface ArticleDao {
	
	public void save(Article article);
	public List<Article> list();
}
