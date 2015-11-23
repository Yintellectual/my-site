package com.i2d23.saloon.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.i2d23.saloon.beans.Post;

public class PostDaoImp implements PostDao{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){		
		this.sessionFactory=sessionFactory;
	}
	@Override
	public void save(Post post){
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(post);
		tx.commit();
		session.close();
	}
	@Override
	public List<Post> list(){
		Session session = this.sessionFactory.openSession();
		List<Post> postList = session.createQuery("from post").list();
		session.close();
		return postList;
	}
}
