package com.pharmacy.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	static {
		try {
			System.out.println("Starting StandardServiceRegistry");

			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();

			System.out.println("Starting Metadata");

			Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();

			System.out.println("Starting Session Factory");

			sessionFactory = metaData.getSessionFactoryBuilder().build();

		} catch (Throwable th) {
			System.out.println("Enitial SessionFactory creation failed " + th);
			throw new ExceptionInInitializerError(th);
		}
	}

	public static SessionFactory getSessionFactory() throws HibernateException {
		return sessionFactory;
	}

}