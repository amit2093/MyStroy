package com.MyStory.Feed;

import com.MyStory.Comment.CommentDto;

public class FeedsDto {

	private int id;
	private String imageUrl;
	private CommentDto commentDto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public CommentDto getCommentDto() {
		return commentDto;
	}
	public void setCommentDto(CommentDto commentDto) {
		this.commentDto = commentDto;
	}
	
	
}
