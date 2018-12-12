package com.MyStory.Comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Person.PersonDto;
import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class CommentController {

	private int i = 1;
	
	@Autowired
	private CommentService commentService;
	
	@GetMapping(ConfigMain.SAVE_COMMENT)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
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
	
	@GetMapping(ConfigMain.GET_ALL_COMMENTS)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public List<Comment> getAllPerson() {
		return commentService.getAllComments();
	}
	
}
