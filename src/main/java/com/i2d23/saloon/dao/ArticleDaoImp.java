package com.i2d23.saloon.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.i2d23.saloon.beans.Article;


public class ArticleDaoImp implements ArticleDao{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){		
		this.sessionFactory=sessionFactory;
	}
	@Override
	public void save(Article article){
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(article);
		tx.commit();
		session.close();
	}
	@Override
	public List<Article> list(){
		Session session = this.sessionFactory.openSession();
		List<Article> postList = session.createQuery("from article").list();
		session.close();
		return postList;
	}
}
