package com.MyStory.Comment;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Feed.FeedsDto;
import com.MyStory.Profile.ProfileDto;
import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@GetMapping(ConfigMain.SAVE_COMMENT)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public void create(CommentDto commentDto){ 
		ProfileDto profileDto = new ProfileDto();
		profileDto.setProfile_Key(2);
		
		FeedsDto feedsDto = new FeedsDto();
		feedsDto.setFeed_Key(1);
		
		commentDto.setComment_Key(3);
		commentDto.setComment_By(profileDto);
		commentDto.setComment_Body("2nd Comment");
		commentDto.setComment_On(feedsDto);
		commentDto.setComment_Date(new Date());
		commentDto.setHas_Replies(false);
		commentDto.setIs_Comment_Deleted(false);
		
		commentService.create(commentDto);
    }
	
	@GetMapping(ConfigMain.GET_ALL_COMMENTS_BY_FEED_ID)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public List<Comment> getAllComments(@PathVariable ("feed_key") int feed_key) {
		return commentService.getAllCommentsByFeedKey(feed_key);
	}
	
	@GetMapping("/saveReply")
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public void createReply(ReplyDto replyDto){ 
		CommentDto commentDto = new CommentDto();
		commentDto.setComment_Key(3);
		
		ProfileDto profileDto = new ProfileDto();
		profileDto.setProfile_Key(1);
		
		replyDto.setReply_Key(5);
		replyDto.setReply_By(profileDto);
		replyDto.setReply_Body("5th Reply");
		replyDto.setReply_On_Comment_Key(2);
		replyDto.setReply_Date(new Date());
		replyDto.setIs_Reply_Deleted(false);
		
		commentService.createReply(replyDto);
    }
	
}
