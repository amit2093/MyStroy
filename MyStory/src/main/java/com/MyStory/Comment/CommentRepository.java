package com.MyStory.Comment;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends CrudRepository<Comment, Integer>{

	@Query(value = "SELECT c FROM Comment c WHERE comment_on_feed_key = :feed_key")
	List<Comment> getAllCommentsByFeedKey(@Param("feed_key") int feed_key);
}
