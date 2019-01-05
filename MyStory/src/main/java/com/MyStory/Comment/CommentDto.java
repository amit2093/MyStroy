package com.MyStory.Comment;

import java.util.Date;

import com.MyStory.Feed.FeedsDto;
import com.MyStory.Profile.ProfileDto;

public class CommentDto {

	private int Comment_Key;
	
	private ProfileDto Comment_By;
	
	private FeedsDto Comment_On;
	
	private Reply Comment_Reply;
	
	private String Comment_Body;
	
	private Date Comment_Date;

	private boolean Has_Replies;
	
	private boolean Is_Comment_Deleted;

	public int getComment_Key() {
		return Comment_Key;
	}

	public void setComment_Key(int comment_Key) {
		Comment_Key = comment_Key;
	}

	public ProfileDto getComment_By() {
		return Comment_By;
	}

	public void setComment_By(ProfileDto comment_By) {
		Comment_By = comment_By;
	}

	public FeedsDto getComment_On() {
		return Comment_On;
	}

	public void setComment_On(FeedsDto comment_On) {
		Comment_On = comment_On;
	}

	public Reply getComment_Reply() {
		return Comment_Reply;
	}

	public void setComment_Reply(Reply comment_Reply) {
		Comment_Reply = comment_Reply;
	}

	public String getComment_Body() {
		return Comment_Body;
	}

	public void setComment_Body(String comment_Body) {
		Comment_Body = comment_Body;
	}

	public Date getComment_Date() {
		return Comment_Date;
	}

	public void setComment_Date(Date comment_Date) {
		Comment_Date = comment_Date;
	}

	public boolean isHas_Replies() {
		return Has_Replies;
	}

	public void setHas_Replies(boolean has_Replies) {
		Has_Replies = has_Replies;
	}

	public boolean isIs_Comment_Deleted() {
		return Is_Comment_Deleted;
	}

	public void setIs_Comment_Deleted(boolean is_Comment_Deleted) {
		Is_Comment_Deleted = is_Comment_Deleted;
	}
}
