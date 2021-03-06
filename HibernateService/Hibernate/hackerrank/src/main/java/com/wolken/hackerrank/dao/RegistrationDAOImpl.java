package com.wolken.hackerrank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.hackerrank.entity.LoginEntity;
import com.wolken.hackerrank.entity.UserEntity;
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
			//String sql="update LoginEntity set password="+"'"+entity.getPassword()+"'"+"where email="+"'"+entity.getEmail()+"'";
			@SuppressWarnings("unchecked")
			//Query<LoginEntity> query=session.createQuery(sql);
			Query<LoginEntity> query=session.createNamedQuery("updatePassword");
			query.setParameter("password", entity.getPassword());
			query.setParameter("email", entity.getEmail());
//			query.setParameter(1, entity.getPassword());
//			query.setParameter(2, entity.getEmail());
			rows=query.executeUpdate();
			//rows=query.uniqueResult();
			//System.out.println(rows);
			transaction.commit();
		}finally {
			session.close();
		}
		return rows;	
	}

	
}
