package com.MyStory.Message;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface MessageService {

	public Message create(MessageDto messageDto);

	public List<?> getMessagae(int PersonMessageToSee_Key, int loggedInUserProfileKey);
}
