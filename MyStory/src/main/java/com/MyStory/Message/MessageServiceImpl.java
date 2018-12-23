package com.MyStory.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageRepository messageRepository;
	
	@Override
	public Message create(MessageDto messageDto) {
		Message message = new Message();
		message.setMessage_From(messageDto.getMessage_From());
		message.setMessage_To(messageDto.getMessage_To());
		message.setMessage_Body(messageDto.getMessage_Body());
		message.setMessage_Date(messageDto.getMessage_Date());
		message.setIs_Messsage_Deleted(messageDto.isIs_Messsage_Deleted());
		return messageRepository.save(message);
	}

	@Override
	public List<?> getMessagae(int PersonMessageToSee_Key, int loggedInUserProfileKey) {
		System.out.println(PersonMessageToSee_Key + "  " + loggedInUserProfileKey);
		return messageRepository.findMessageById(PersonMessageToSee_Key, loggedInUserProfileKey);
	}

}
