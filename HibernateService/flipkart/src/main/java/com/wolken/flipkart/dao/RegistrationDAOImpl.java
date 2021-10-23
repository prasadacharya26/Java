package com.wolken.flipkart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.flipkart.dto.FlipkartDTO;
import com.wolken.flipkart.entity.FlipkartEntity;
import com.wolken.hibernateUtils.utils.HibernateUtils;

public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(FlipkartEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			
		}finally {
			session.close();
		}
		return 0;
	}
}
