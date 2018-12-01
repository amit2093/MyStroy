package com.MyStory.Comment;

import com.MyStory.Person.PersonDto;

public class CommentDto {

	private int id;
	private String comment;
	private PersonDto personDto;
	private int feedId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public PersonDto getPersonDto() {
		return personDto;
	}
	public void setPersonDto(PersonDto personDto) {
		this.personDto = personDto;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	
	
}
