package com.MyStory.Feed;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Profile.ProfileDto;
import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class FeedsController {

	@Autowired
	private FeedsService feedsService;
	
	@GetMapping(ConfigMain.SAVE_FEEDS)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
    public void create(FeedsDto feedsDto){ 
		ProfileDto profileDto = new ProfileDto();
		profileDto.setProfile_Key(1);
		
		feedsDto.setFeed_Key(1);
		feedsDto.setFeed_Title("Feed Title");
		feedsDto.setFeed_Description("This is a feed description.");
		feedsDto.setFeed_Upload_Date(new Date());
		feedsDto.setTotal_Likes(14);
		feedsDto.setFeed_Uploaded_By(profileDto);
		feedsDto.setImage_Url("www.feeds/Image/Url");
		feedsDto.setIs_Feed_Deleted(false);
		feedsDto.setTotal_Views(542);
		feedsService.create(feedsDto);
    }
	
	@GetMapping(ConfigMain.GET_ALL_FEEDS)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public List<Feeds> getAllFeeds() {
		return feedsService.getAllFeeds();
	}
	
	@GetMapping(ConfigMain.GET_FEED_VIA_FEED_ID)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public Optional<Feeds> getFeed(@PathVariable("feed_key") int feed_key) {
		return feedsService.getFeed(feed_key);
	}
}
