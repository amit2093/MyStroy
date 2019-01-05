package com.MyStory.Feed;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.MyStory.Profile.Profile;

@Entity
@Table(name = "Feeds")
public class Feeds {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Feed_Key")
	private int Feed_Key;
	
	@ManyToOne
	private Profile Feed_Uploaded_By;
	
	@Column(name = "Feed_Title")
	private String Feed_Title;
	
	@Column(name = "Feed_Description")
	private String Feed_Description;
	
	@Column(name = "Image_Url")
	private String Image_Url;
	
	@Column(name = "Total_Likes")
	private int Total_Likes;
	
	@Column(name = "Total_Views")
	private int Total_Views;
	
	@Column(name = "Feed_Upload_Date")
	private Date Feed_Upload_Date;
	
	@Column(name = "Is_Feed_Deleted")
	private boolean Is_Feed_Deleted;

	public int getFeed_Key() {
		return Feed_Key;
	}

	public void setFeed_Key(int feed_Key) {
		Feed_Key = feed_Key;
	}

	public Profile getFeed_Uploaded_By() {
		return Feed_Uploaded_By;
	}

	public void setFeed_Uploaded_By(Profile feed_Uploaded_By) {
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

	public int getTotal_Likes() {
		return Total_Likes;
	}

	public void setTotal_Likes(int total_Likes) {
		Total_Likes = total_Likes;
	}

	public String getImage_Url() {
		return Image_Url;
	}

	public void setImage_Url(String image_Url) {
		Image_Url = image_Url;
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
