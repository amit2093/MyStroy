package com.MyStory.Comment;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentService {

	public Comment create(CommentDto commentDto);
	
	public List<Comment> getAllComments();

}

