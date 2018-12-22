package com.MyStory.Friends.FriendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Friend_WithServiceImpl implements Friend_WithService{

	@Autowired
	Friend_WithRepository friend_WithRepository;
	
	@Override
	public Friend_With create(Friend_WithDto friend_WithDto) {
		
		Friend_With friend_With = new Friend_With();
		friend_With.setProfile_Key(friend_WithDto.getProfile_Key());
		friend_With.setFriend_To(friend_WithDto.getFriend_To());
		friend_With.setFriends_Since(friend_WithDto.getFriends_Since());
		return friend_WithRepository.save(friend_With);
	}

}
