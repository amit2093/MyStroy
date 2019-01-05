package com.MyStory.Comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyStory.Feed.Feeds;
import com.MyStory.Profile.Profile;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private ReplyRepository replyRepository;
	
	@Override
	public Comment create(CommentDto commentDto) {
		Profile profile = new Profile();
		profile.setProfile_Key(commentDto.getComment_By().getProfile_Key());
		
		Feeds feeds = new Feeds();
		feeds.setFeed_Key(commentDto.getComment_On().getFeed_Key());
		
		Comment comment = new Comment();
		comment.setComment_Key(commentDto.getComment_Key());
		comment.setComment_By(profile);
		comment.setComment_Body(commentDto.getComment_Body());
		comment.setComment_Date(commentDto.getComment_Date());
		comment.setComment_On(feeds);
		comment.setHas_Replies(commentDto.isHas_Replies());
		comment.setIs_Comment_Deleted(commentDto.isIs_Comment_Deleted());
		
		return commentRepository.save(comment);
	}

	@Override
	public List<Comment> getAllCommentsByFeedKey(int feed_key) {		
		return commentRepository.getAllCommentsByFeedKey(feed_key);
	}

	@Override
	public Reply createReply(ReplyDto replyDto) {
		Profile profile = new Profile();
		profile.setProfile_Key(replyDto.getReply_By().getProfile_Key());
		
		Reply reply = new Reply();
		reply.setReply_Key(replyDto.getReply_Key());
		reply.setIs_Reply_Deleted(replyDto.isIs_Reply_Deleted());
		reply.setReply_Body(replyDto.getReply_Body());
		reply.setReply_Date(replyDto.getReply_Date());
		reply.setReply_On_Comment_Key(replyDto.getReply_On_Comment_Key());
		reply.setReply_By(profile);
		return replyRepository.save(reply);
	}
	
}
