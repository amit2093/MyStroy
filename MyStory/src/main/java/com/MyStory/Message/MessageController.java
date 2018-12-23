package com.MyStory.Message;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Profile.Profile;
import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class MessageController {

	@Autowired 
	MessageService messageService;
	
	@GetMapping("/Message")
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public void createMessage(MessageDto messageDto) {
		
		messageDto.setMessage_From(3);
		messageDto.setMessage_To(1);
		messageDto.setMessage_Body("ok");
		messageDto.setMessage_Date(new Date());
		messageDto.setIs_Messsage_Deleted(false);
		messageService.create(messageDto);
	}
	
	@GetMapping("/GetMessage/{PersonMessageToSee_Key}/{loggedInUserProfileKey}")
	public  List<?> getMessageByMessage_From(@PathVariable("PersonMessageToSee_Key") int PersonMessageToSee_Key, 
			@PathVariable("loggedInUserProfileKey") int loggedInUserProfileKey) {
		return messageService.getMessagae(PersonMessageToSee_Key, loggedInUserProfileKey);
	}
}
