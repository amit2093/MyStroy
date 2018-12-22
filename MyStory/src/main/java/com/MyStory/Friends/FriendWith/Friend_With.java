package com.MyStory.Friends.FriendWith;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Friend_With")
public class Friend_With {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Friend_With_Key")
	private int Friend_With_Key;
	
	@Column(name="Profile_Key")
	private int Profile_Key;
	
	@Column(name="Friend_To")
	private int Friend_To;

	@Column(name="Friends_Since")
	private Date Friends_Since;
	
	public int getFriend_With_Key() {
		return Friend_With_Key;
	}

	public void setFriend_With_Key(int friend_With_Key) {
		Friend_With_Key = friend_With_Key;
	}

	public int getProfile_Key() {
		return Profile_Key;
	}

	public void setProfile_Key(int profile_Key) {
		Profile_Key = profile_Key;
	}

	public int getFriend_To() {
		return Friend_To;
	}

	public void setFriend_To(int friend_To) {
		Friend_To = friend_To;
	}

	public Date getFriends_Since() {
		return Friends_Since;
	}

	public void setFriends_Since(Date friends_Since) {
		Friends_Since = friends_Since;
	}
	
	
}
