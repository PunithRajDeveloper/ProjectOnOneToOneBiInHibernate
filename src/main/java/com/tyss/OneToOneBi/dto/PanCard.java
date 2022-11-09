package com.tyss.OneToOneBi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PanCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String panCardNum;
	
	@OneToOne(mappedBy = "card" )
	private Person person;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPanCardNum() {
		return panCardNum;
	}

	public void setPanCardNum(String panCardNum) {
		this.panCardNum = panCardNum;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PanCard [id=" + id + ", name=" + name + ", panCardNum=" + panCardNum + ", person=" + person + "]";
	}
	
	
	
}
