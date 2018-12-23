package com.MyStory.Message;

import java.util.Date;

import com.MyStory.Profile.Profile;

public class MessageDto {

	private int Message_Key;
	
	private int Message_From;
	
	private int Message_To;
	
	private String Message_Body;
	
	private Date Message_Date;
	
	private boolean Is_Messsage_Deleted;
	
	private boolean Person_Type;
	
	private Profile profile;
	
	public int getMessage_Key() {
		return Message_Key;
	}
	public void setMessage_Key(int message_Key) {
		Message_Key = message_Key;
	}
	public int getMessage_From() {
		return Message_From;
	}
	public void setMessage_From(int message_From) {
		Message_From = message_From;
	}
	public int getMessage_To() {
		return Message_To;
	}
	public void setMessage_To(int message_To) {
		Message_To = message_To;
	}
	public String getMessage_Body() {
		return Message_Body;
	}
	public void setMessage_Body(String message_Body) {
		Message_Body = message_Body;
	}
	public Date getMessage_Date() {
		return Message_Date;
	}
	public void setMessage_Date(Date message_Date) {
		Message_Date = message_Date;
	}
	public boolean isIs_Messsage_Deleted() {
		return Is_Messsage_Deleted;
	}
	public void setIs_Messsage_Deleted(boolean is_Messsage_Deleted) {
		Is_Messsage_Deleted = is_Messsage_Deleted;
	}
	public boolean isPerson_Type() {
		return Person_Type;
	}
	public void setPerson_Type(boolean person_Type) {
		Person_Type = person_Type;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
