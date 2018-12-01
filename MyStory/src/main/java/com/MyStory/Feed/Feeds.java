package com.MyStory.Feed;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.MyStory.Comment.Comment;

@Entity
@Table(name = "Feeds")
public class Feeds {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="feeds_Id")
	private int feeds_Id;
	
	@Column
	private String imageUrl;
	
	@OneToMany(mappedBy = "feedId", cascade = CascadeType.ALL)
	private List<Comment> comment;

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	
	public int getFeeds_Id() {
		return feeds_Id;
	}

	public void setFeeds_Id(int feeds_Id) {
		this.feeds_Id = feeds_Id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
