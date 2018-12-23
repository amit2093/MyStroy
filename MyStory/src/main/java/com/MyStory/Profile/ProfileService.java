package com.MyStory.Profile;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProfileService {

	public Profile create(ProfileDto profileDto);
	
	public Profile getProfileById(int Profile_Key);
	
	public List<Profile> getAllProfiles();
}
