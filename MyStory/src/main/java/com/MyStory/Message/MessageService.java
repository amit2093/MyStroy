package com.MyStory.Message;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MessageService {

	public Message create(MessageDto messageDto);

	public List<?> getAllChats(int loggedInUserProfileKey);
	
	public List<?> getMessagae(int PersonMessageToSee_Key, int loggedInUserProfileKey);
	
	public List<?> getAllOnlineFriends(int loggedInUserProfileKey);
}
