package com.MyStory.Friends;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Friendship_RequestServiceImpl implements Friendship_RequestService{

	@Autowired
	private Friendship_RequestRepository friendship_RequestRepository;

	@Override
	public Friendship_Request create(Friendship_RequestDto friendship_RequestDto) {
		
		Friendship_Request friendship_Request = new Friendship_Request();
		friendship_Request.setRequest_To(friendship_RequestDto.getRequest_To());
		friendship_Request.setRequest_From(friendship_RequestDto.getRequest_From());
		friendship_Request.setIs_Request_Accepted(friendship_RequestDto.isIs_Request_Accepted());
		friendship_Request.setIs_Request_Deleted(friendship_RequestDto.isIs_Request_Deleted());
		friendship_Request.setRequest_Date(friendship_RequestDto.getRequest_Date());
		
		return friendship_RequestRepository.save(friendship_Request);
	}

	@Override
	public List<Friendship_Request> getAllFriends(int Profile_Key) {
		return friendship_RequestRepository.getAllFriends(Profile_Key);
	}
}
