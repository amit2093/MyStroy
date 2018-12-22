package com.MyStory.Friends;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Friendship_Request")
public class Friendship_Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Friendship_Request_Key")
	private int Friendship_Request_Key;
	
	@Column(name="Request_To")
	private int Request_To;
	
	@Column(name="Request_From")
	private int Request_From;
	
	@Column(name="Is_Request_Accepted")
	private boolean Is_Request_Accepted;
	
	@Column(name="Is_Request_Deleted")
	private boolean Is_Request_Deleted;
	
	@Column(name="Request_Date")
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
