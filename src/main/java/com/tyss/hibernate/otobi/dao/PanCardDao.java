package com.tyss.hibernate.otobi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.OneToOneBi.dto.PanCard;
import com.tyss.OneToOneBi.dto.Person;

public class PanCardDao {

	public void savePanCard(PanCard card) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Person  person=card.getPerson();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(card);
		entityTransaction.commit();


	}
	
	public PanCard retrivePanCaed(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		PanCard card=entityManager.find(PanCard.class, id);
		
		return card;
		
	}

}
