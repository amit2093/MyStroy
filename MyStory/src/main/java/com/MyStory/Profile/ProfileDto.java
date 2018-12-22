package com.MyStory.Profile;

import java.util.Date;

public class ProfileDto {

	private int Profile_Key;
	
	private String Profile_Name;
	
	private String Email;
	
	private String Work;
	
	private String Relationship_Status;
	
	private boolean Is_Online;
	
	private int Friends_Count;
	
	private String Profile_Image_Url;
	
	private String Profile_Cover_Url;
	
	private Date Joined_Date;
	
	private int Total_Requests;

	public int getProfile_Key() {
		return Profile_Key;
	}

	public void setProfile_Key(int profile_Key) {
		Profile_Key = profile_Key;
	}

	public String getProfile_Name() {
		return Profile_Name;
	}

	public void setProfile_Name(String profile_Name) {
		Profile_Name = profile_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getWork() {
		return Work;
	}

	public void setWork(String work) {
		Work = work;
	}

	public String getRelationship_Status() {
		return Relationship_Status;
	}

	public void setRelationship_Status(String relationship_Status) {
		Relationship_Status = relationship_Status;
	}

	public boolean isIs_Online() {
		return Is_Online;
	}

	public void setIs_Online(boolean is_Online) {
		Is_Online = is_Online;
	}

	public int getFriends_Count() {
		return Friends_Count;
	}

	public void setFriends_Count(int friends_Count) {
		Friends_Count = friends_Count;
	}

	public String getProfile_Image_Url() {
		return Profile_Image_Url;
	}

	public void setProfile_Image_Url(String profile_Image_Url) {
		Profile_Image_Url = profile_Image_Url;
	}

	public String getProfile_Cover_Url() {
		return Profile_Cover_Url;
	}

	public void setProfile_Cover_Url(String profile_Cover_Url) {
		Profile_Cover_Url = profile_Cover_Url;
	}

	public Date getJoined_Date() {
		return Joined_Date;
	}

	public void setJoined_Date(Date joined_Date) {
		Joined_Date = joined_Date;
	}

	public int getTotal_Requests() {
		return Total_Requests;
	}

	public void setTotal_Requests(int total_Requests) {
		Total_Requests = total_Requests;
	}
	
	
}
