package com.MyStory.Message;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.MyStory.Profile.Profile;

@Entity
@Table(name="Message")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Message_Key")
	private int Message_Key;
	
	@Column(name="Message_From")
	private int Message_From;
	
	@Column(name="Message_To")
	private int Message_To;
	
	@Column(name="Message_Body")
	private String Message_Body;
	
	@Column(name="Message_Date")
	private Date Message_Date;
	
	@Column(name="Is_Messsage_Deleted")
	private boolean Is_Messsage_Deleted;
	
	@Column(name="Person_Type")
	private boolean Person_Type;
	
	@ManyToOne (cascade = {CascadeType.ALL})
	@JoinColumn(name = "Profile_Key")
	private Profile profile;
	
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
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
}
