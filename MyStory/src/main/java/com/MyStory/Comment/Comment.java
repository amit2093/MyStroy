package com.MyStory.Comment;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.MyStory.Person.Person;

@Entity
@Table(name="Comment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comment_id")
	private int comment_id;
	
	@Column
	private String comment;

	@Column
	private int feedId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_fk")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
//	public int getFeedId() {
//		return feedId;
//	}

	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
