package com.wolken.market_detail.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hibernateUtils.utils.HibernateUtils;
import com.wolken.market_detail.entity.MarketDetailEntity;


public class MarketDetailsDAOImpl implements MarketDetailsDAO {

	public boolean save(MarketDetailEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			if(entity!=null) {
				result=true;
			}else {
				result=false;
			}
		}finally {
			session.close();
		}
		return result;
	}

	public boolean getById(int id) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		MarketDetailEntity entity=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			entity=session.get(MarketDetailEntity.class,id);
			System.out.println(entity);
			if(entity!=null) {
				result=true;
			}else {
				result=false;
			}
		}finally {
			session.close();
		}
		return result;
	}

	public boolean updateById(MarketDetailEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
			result=true;
		}finally {
			session.close();
		}
		return result;
	}

	public boolean deleteById(MarketDetailEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(entity);
			transaction.commit();
			result=true;
		}finally {
			session.close();
		}
		return result;
	}
}
