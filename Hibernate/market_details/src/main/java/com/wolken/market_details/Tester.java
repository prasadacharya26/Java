package com.wolken.market_details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolken.market_details.entity.Market_Details;

public class Tester {
	public static void main(String[] args) {
		Session session = null;
		SessionFactory factory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			factory = configuration.buildSessionFactory();
			session = factory.openSession();
			Market_Details details = (Market_Details)session.get(Market_Details.class, 1);
			System.out.println(details);
		}finally {
			session.close();
			factory.close();
		}
	}
}
