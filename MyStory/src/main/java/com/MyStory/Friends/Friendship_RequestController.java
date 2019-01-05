package com.MyStory.Friends;

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
public class Friendship_RequestController {

	@Autowired
	Friendship_RequestService friendship_RequestService;
	
	@GetMapping(ConfigMain.CREATE_FRIENDSHIP_REQUEST)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public void create(Friendship_RequestDto friendship_RequestDto) {
		
		friendship_RequestDto.setRequest_To(1);
		friendship_RequestDto.setRequest_From(3);
		friendship_RequestDto.setIs_Request_Accepted(true);
		friendship_RequestDto.setIs_Request_Deleted(false);
		friendship_RequestDto.setRequest_Date(new Date());
		friendship_RequestService.create(friendship_RequestDto);
	}
	
	@GetMapping(ConfigMain.GET_ALL_FRIENDS_BY_ID)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public List<?> getAllFriends(@PathVariable("Profile_Key") int Profile_Key) {
		return friendship_RequestService.getAllFriends(Profile_Key);
	}
}
