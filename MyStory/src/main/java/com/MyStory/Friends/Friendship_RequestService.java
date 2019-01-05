package com.MyStory.Friends;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Friendship_RequestService {

	public Friendship_Request create(Friendship_RequestDto friendship_RequestDto);
	
	public List<?>getAllFriends(int Profile_Key);
}
