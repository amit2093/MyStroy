package com.MyStory.Friends.FriendWith;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class Friend_WithController {

	@Autowired
	Friend_WithService friend_WithService;
	
	@GetMapping(ConfigMain.FRIEND_WITH)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public void create(Friend_WithDto friend_WithDto) {
		friend_WithDto.setProfile_Key(1);
		friend_WithDto.setFriend_To(2);
		friend_WithDto.setFriends_Since(new Date());
		friend_WithService.create(friend_WithDto);
		
		friend_WithDto.setProfile_Key(1);
		friend_WithDto.setFriend_To(3);
		friend_WithDto.setFriends_Since(new Date());
		friend_WithService.create(friend_WithDto);
		
		friend_WithDto.setProfile_Key(1);
		friend_WithDto.setFriend_To(4);
		friend_WithDto.setFriends_Since(new Date());
		friend_WithService.create(friend_WithDto);
		
		friend_WithDto.setProfile_Key(2);
		friend_WithDto.setFriend_To(3);
		friend_WithDto.setFriends_Since(new Date());
		friend_WithService.create(friend_WithDto);
		
		friend_WithDto.setProfile_Key(2);
		friend_WithDto.setFriend_To(4);
		friend_WithDto.setFriends_Since(new Date());
		friend_WithService.create(friend_WithDto);
	}
}
