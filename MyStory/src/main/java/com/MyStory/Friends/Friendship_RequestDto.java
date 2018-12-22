package com.MyStory.Friends;

import java.util.Date;

public class Friendship_RequestDto {
	
	private int Friendship_Request_Key;
	
	private int Request_To;
	
	private int Request_From;
	
	private boolean Is_Request_Accepted;
	
	private boolean Is_Request_Deleted;
	
	private Date Request_Date;
	
	public int getFriendship_Request_Key() {
		return Friendship_Request_Key;
	}
	public void setFriendship_Request_Key(int friendship_Request_Key) {
		Friendship_Request_Key = friendship_Request_Key;
	}
	public int getRequest_To() {
		return Request_To;
	}
	public void setRequest_To(int request_To) {
		Request_To = request_To;
	}
	public int getRequest_From() {
		return Request_From;
	}
	public void setRequest_From(int request_From) {
		Request_From = request_From;
	}
	public boolean isIs_Request_Accepted() {
		return Is_Request_Accepted;
	}
	public void setIs_Request_Accepted(boolean is_Request_Accepted) {
		Is_Request_Accepted = is_Request_Accepted;
	}
	public boolean isIs_Request_Deleted() {
		return Is_Request_Deleted;
	}
	public void setIs_Request_Deleted(boolean is_Request_Deleted) {
		Is_Request_Deleted = is_Request_Deleted;
	}
	public Date getRequest_Date() {
		return Request_Date;
	}
	public void setRequest_Date(Date request_Date) {
		Request_Date = request_Date;
	}
}
