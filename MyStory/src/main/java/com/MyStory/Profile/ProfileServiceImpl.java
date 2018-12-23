package com.MyStory.Profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public Profile create(ProfileDto profileDto) {
		Profile profile = new Profile();
//		profile.setProfile_Key(profileDto.getProfile_Key());
		profile.setProfile_Name(profileDto.getProfile_Name());
		profile.setEmail(profileDto.getEmail());
		profile.setWork(profileDto.getWork());
		profile.setRelationship_Status(profileDto.getRelationship_Status());
		profile.setIs_Online(profileDto.isIs_Online());
		profile.setFriends_Count(profileDto.getFriends_Count());
		profile.setProfile_Image_Url(profileDto.getProfile_Image_Url());
		profile.setProfile_Cover_Url(profileDto.getProfile_Cover_Url());
		profile.setJoined_Date(profileDto.getJoined_Date());
		profile.setTotal_Requests(profileDto.getTotal_Requests());
		return profileRepository.save(profile);
	}

	@Override
	public Profile getProfileById(int Profile_Key) {
		
		return profileRepository.getProfileById(Profile_Key);
	}

	@Override
	public List<Profile> getAllProfiles() {
		return profileRepository.getAllProfiles();
	}
}
