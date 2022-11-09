package com.oneToOne.controller;

import com.tyss.OneToOneBi.dto.PanCard;
import com.tyss.OneToOneBi.dto.Person;
import com.tyss.hibernate.otobi.dao.PanCardDao;
import com.tyss.hibernate.otobi.dao.PersonDao;

public class PeronDriver {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setName("Arun");
//	person.setAge(23);
//	person.setGendrer("MALE");
//	person.setAddress("Bangalore");
//	
//	PanCard card=new PanCard();
//	card.setName("Arun");
//	card.setPanCardNum("FLOKJ450PQ");
//	card.setPerson(person);
//	
//	person.setCard(card);
//	
	PersonDao  dao=new PersonDao();
//	dao.savePerson(person);
	PanCardDao cardDao=new PanCardDao();
	//cardDao.savePanCard(card);
	
Person person =	dao.reteivePerson(1);
System.out.println(person);
	
}
}
