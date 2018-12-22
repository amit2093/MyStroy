package com.MyStory.Profile;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class ProfileController {

	@Autowired
	ProfileService profileService;
	
	@GetMapping(ConfigMain.SAVE_PROFILE)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public void createProfile(ProfileDto profileDto) {
		profileDto.setProfile_Name("Amit Saxena");
		profileDto.setEmail("er.amit1493@gmail.com");
		profileDto.setWork("Digital Harbour INC");
		profileDto.setRelationship_Status("In a Relationship");
		profileDto.setIs_Online(true);
		profileDto.setFriends_Count(350);
		profileDto.setProfile_Image_Url("profile image Amit");
		profileDto.setProfile_Cover_Url("cover image Amit");
		profileDto.setJoined_Date(new Date());
		profileDto.setTotal_Requests(5);
		
		profileService.create(profileDto);
		
	}
}
