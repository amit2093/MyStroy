package com.MyStory.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Images")
public class Images {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Image_Key")
	private int Image_Key;
	
	@Column(name = "Image_Of_Feed_Key")
	private int Image_Of_Feed_Key;
	
	@Column(name = "Image_Url")
	private String Image_Url;

	public int getImage_Key() {
		return Image_Key;
	}

	public void setImage_Key(int image_Key) {
		Image_Key = image_Key;
	}

	public int getImage_Of_Feed_Key() {
		return Image_Of_Feed_Key;
	}

	public void setImage_Of_Feed_Key(int image_Of_Feed_Key) {
		Image_Of_Feed_Key = image_Of_Feed_Key;
	}

	public String getImage_Url() {
		return Image_Url;
	}

	public void setImage_Url(String image_Url) {
		Image_Url = image_Url;
	}
	
	
}
