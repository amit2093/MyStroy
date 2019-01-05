package com.MyStory.Comment;

import java.util.Date;

import com.MyStory.Profile.ProfileDto;

public class ReplyDto {

	private int Reply_Key;
	
	private int Reply_On_Comment_Key;
	
	private ProfileDto Reply_By;
	
	private String Reply_Body;
	
	private Date Reply_Date;
	
	private boolean Is_Reply_Deleted;

	public int getReply_Key() {
		return Reply_Key;
	}

	public void setReply_Key(int reply_Key) {
		Reply_Key = reply_Key;
	}

	public int getReply_On_Comment_Key() {
		return Reply_On_Comment_Key;
	}

	public void setReply_On_Comment_Key(int reply_On_Comment_Key) {
		Reply_On_Comment_Key = reply_On_Comment_Key;
	}

	public ProfileDto getReply_By() {
		return Reply_By;
	}

	public void setReply_By(ProfileDto reply_By) {
		Reply_By = reply_By;
	}

	public String getReply_Body() {
		return Reply_Body;
	}

	public void setReply_Body(String reply_Body) {
		Reply_Body = reply_Body;
	}

	public Date getReply_Date() {
		return Reply_Date;
	}

	public void setReply_Date(Date reply_Date) {
		Reply_Date = reply_Date;
	}

	public boolean isIs_Reply_Deleted() {
		return Is_Reply_Deleted;
	}

	public void setIs_Reply_Deleted(boolean is_Reply_Deleted) {
		Is_Reply_Deleted = is_Reply_Deleted;
	}
	
	
}
