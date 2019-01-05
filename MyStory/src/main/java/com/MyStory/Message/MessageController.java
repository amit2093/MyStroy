package com.MyStory.Message;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class MessageController {

	private int loggedInUserProfileKey = 1;   
	
	@Autowired 
	MessageService messageService;
	
	@GetMapping(ConfigMain.CREATE_NEW_MESSAGE)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public void createMessage(MessageDto messageDto) {
		
		messageDto.setMessage_From(1);
		messageDto.setMessage_To(3);
		messageDto.setMessage_Body("What Ok??");
		messageDto.setMessage_Date(new Date());
		messageDto.setIs_Messsage_Deleted(false);
		messageService.create(messageDto);
	}
	
	@GetMapping(ConfigMain.GET_ALL_CHATS)
	public List<?> getAllChats(){
		return messageService.getAllChats(loggedInUserProfileKey);
	}
	
	@GetMapping(ConfigMain.GET_CHAT_BY_IDS)
	public  List<?> getMessageByMessage_From(@PathVariable("PersonMessageToSee_Key") int PersonMessageToSee_Key, 
			@PathVariable("loggedInUserProfileKey") int loggedInUserProfileKey) {
		return messageService.getMessagae(PersonMessageToSee_Key, loggedInUserProfileKey);
	}
	
	@GetMapping(ConfigMain.GET_ALL_ONLINE_FRIENDS)
	public List<?> getAllOnlineFriends(@PathVariable("loggedInUserProfileKey") int loggedInUserProfileKey){
		return messageService.getAllOnlineFriends(loggedInUserProfileKey);
	}
}
