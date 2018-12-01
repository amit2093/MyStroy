package com.MyStory.Comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Person.PersonDto;

@RestController
public class CommentController {

	int i = 1;
	
	@Autowired
	private CommentService commentService;
	
	@GetMapping("/saveComment")
	 public void create(CommentDto commentDto){ 
		commentDto.setComment("Comment " + i);
		PersonDto personDto = new PersonDto();
		personDto.setId(i);		
		commentDto.setFeedId(1);
		commentDto.setPersonDto(personDto);
		i++;
		commentService.create(commentDto);
    }
	
	@GetMapping("/getAllComments")
	public List<Comment> getAllPerson() {
		return commentService.getAllComments();
	}
	
}
