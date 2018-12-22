package com.MyStory.Friends.FriendWith;

import org.springframework.stereotype.Repository;

@Repository
public interface Friend_WithService {

	public Friend_With create(Friend_WithDto friend_WithDto);
}
