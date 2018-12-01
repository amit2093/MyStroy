package com.MyStory.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.MyStory.Comment.Comment;

@Entity
@Table(name="Person")
public class Person {

	@Id
	@Column(name="person_Id")
	private int person_Id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@OneToOne(mappedBy = "person")
	private Comment commentId;

	public int getPerson_Id() {
		return person_Id;
	}

	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
