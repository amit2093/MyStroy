package com.MyStory.Comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Person.PersonDto;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommentController {

	private int i = 1;
	
	@Autowired
	private CommentService commentService;
	
	@GetMapping("/saveComment")
	@CrossOrigin(origins = "http://localhost:4200")
	 public void create(@RequestBody CommentDto commentDto){ 
		System.out.println("" + commentDto.getComment());
		commentDto.setComment("Comment " + i);
		PersonDto personDto = new PersonDto();
		personDto.setId(i);		
		commentDto.setFeedId(1);
		commentDto.setPersonDto(personDto);
		i++;
		//commentService.create(commentDto);
    }
	
	@GetMapping("/getAllComments")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Comment> getAllPerson() {
		return commentService.getAllComments();
	}
	
}
