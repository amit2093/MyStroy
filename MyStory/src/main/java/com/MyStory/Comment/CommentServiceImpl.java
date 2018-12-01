package com.MyStory.Comment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyStory.Person.Person;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public Comment create(CommentDto commentDto) {
		Comment comment = new Comment();
		comment.setComment(commentDto.getComment());
		
		Person person = new Person();
		person.setPerson_Id(commentDto.getPersonDto().getId());
		comment.setPerson(person);
		comment.setFeedId(commentDto.getFeedId());
		return commentRepository.save(comment);
	}

	@Override
	public List<Comment> getAllComments() {
		List<Comment> commentList = new ArrayList<Comment>();
		
		Iterable<Comment> iterable = commentRepository.findAll();
		Iterator<Comment> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Comment comment = iterator.next();
			commentList.add(comment);
	    }
		
		return commentList;
	}
	
}
