package com.wolken.facebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.facebook.entity.LoginEntity;
import com.wolken.facebook.entity.UserEntity;
import com.wolken.hibernateUtils.utils.HibernateUtils;

public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(UserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			rows=1;
		}finally {
			session.close();
		}
		return rows;
	}

	
	public LoginEntity getByEmail(String email) {
		Session session=null;
		SessionFactory factory=null;
		LoginEntity entity=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			@SuppressWarnings("unchecked")
			Query<LoginEntity> query=session.createNamedQuery("getByEmail");
			query.setParameter("email", email);
			entity=(LoginEntity) query.uniqueResult();
		} finally {
			session.close();
		}
		return entity;
	}


	
	public int forgotPassword(LoginEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Query<LoginEntity> query=session.createNamedQuery("updatePassword");
			query.setParameter("pass", entity.getPassword());
			query.setParameter("email", entity.getEmail());
			rows=query.executeUpdate();
			transaction.commit();
		}finally {
			session.close();
		}
		return rows;	
	}

	
}
