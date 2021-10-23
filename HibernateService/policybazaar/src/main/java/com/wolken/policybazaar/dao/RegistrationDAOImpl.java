package com.wolken.policybazaar.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hibernateUtils.utils.HibernateUtils;
import com.wolken.policybazaar.entity.PolicyBazaarEntity;

public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(PolicyBazaarEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
		}finally {
			session.close();
		}
		return 1;
	}

}
