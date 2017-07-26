package ua.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		
		factory.close();
	}

}
