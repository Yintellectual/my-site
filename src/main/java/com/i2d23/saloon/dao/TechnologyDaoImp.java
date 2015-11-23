package com.i2d23.saloon.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.i2d23.saloon.beans.Technology;

public class TechnologyDaoImp implements TechnologyDao{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){		
		this.sessionFactory=sessionFactory;
	}
	@Override
	public void save(Technology technology){
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(technology);
		tx.commit();
		session.close();
	}
	@Override
	public List<Technology> list(){
		Session session = this.sessionFactory.openSession();
		List<Technology> postList = session.createQuery("from technology" ).list();
		session.close();
		return postList;
	}
}
