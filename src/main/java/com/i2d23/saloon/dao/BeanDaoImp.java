package com.i2d23.saloon.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.i2d23.saloon.beans.Post;

public class BeanDaoImp<T> implements BeanDao<T>{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){		
		this.sessionFactory=sessionFactory;
	}
	@Override
	public void save(T t){
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(t);
		tx.commit();
		session.close();
	}
	@Override
	public List<T> list(T t){
		Session session = this.sessionFactory.openSession();
		List<T> postList = session.createQuery("from "+ t.getClass().getName().toLowerCase()).list();
		session.close();
		return postList;
	}
}
