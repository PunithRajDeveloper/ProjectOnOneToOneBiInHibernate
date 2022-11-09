package com.tyss.hibernate.otobi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.OneToOneBi.dto.PanCard;
import com.tyss.OneToOneBi.dto.Person;

public class PersonDao {
	public void savePerson(Person person) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
        
		PanCard  card=person.getCard();
		
		entityTransaction.begin();
		entityManager.persist(card);
		entityManager.persist(person); 
		entityTransaction.commit();

	}
	
	public Person reteivePerson(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class, id);
		
		return person;
	}
	

}
