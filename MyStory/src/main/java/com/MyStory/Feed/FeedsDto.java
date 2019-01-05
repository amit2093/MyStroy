package com.MyStory.Feed;

import java.util.Date;

import com.MyStory.Profile.ProfileDto;

public class FeedsDto {

	private int Feed_Key;
	
	private ProfileDto Feed_Uploaded_By;
	
	private String Feed_Title;
	
	private String Feed_Description;
	
	private String Image_Url;
	
	private int Total_Likes;
	
	private int Total_Views;
	
	private Date Feed_Upload_Date;
	
	private boolean Is_Feed_Deleted;

	public int getFeed_Key() {
		return Feed_Key;
	}

	public void setFeed_Key(int feed_Key) {
		Feed_Key = feed_Key;
	}

	
	public ProfileDto getFeed_Uploaded_By() {
		return Feed_Uploaded_By;
	}

	public void setFeed_Uploaded_By(ProfileDto feed_Uploaded_By) {
		Feed_Uploaded_By = feed_Uploaded_By;
	}

	public String getFeed_Title() {
		return Feed_Title;
	}

	public void setFeed_Title(String feed_Title) {
		Feed_Title = feed_Title;
	}

	public String getFeed_Description() {
		return Feed_Description;
	}

	public void setFeed_Description(String feed_Description) {
		Feed_Description = feed_Description;
	}

	public String getImage_Url() {
		return Image_Url;
	}

	public void setImage_Url(String image_Url) {
		Image_Url = image_Url;
	}

	public int getTotal_Likes() {
		return Total_Likes;
	}

	public void setTotal_Likes(int total_Likes) {
		Total_Likes = total_Likes;
	}

	public int getTotal_Views() {
		return Total_Views;
	}

	public void setTotal_Views(int total_Views) {
		Total_Views = total_Views;
	}

	public Date getFeed_Upload_Date() {
		return Feed_Upload_Date;
	}

	public void setFeed_Upload_Date(Date feed_Upload_Date) {
		Feed_Upload_Date = feed_Upload_Date;
	}

	public boolean isIs_Feed_Deleted() {
		return Is_Feed_Deleted;
	}

	public void setIs_Feed_Deleted(boolean is_Feed_Deleted) {
		Is_Feed_Deleted = is_Feed_Deleted;
	}
	
//	@Column(name = "Feed_Tags")
//	private Tags Feed_Tags;
	

	
	
}
