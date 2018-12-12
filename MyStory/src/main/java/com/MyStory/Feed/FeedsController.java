package com.MyStory.Feed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.MyStory.Utils.ConfigMain;

@RestController
@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
public class FeedsController {

	@Autowired
	private FeedsService feedsService;
	
	
	@GetMapping(ConfigMain.SAVE_FEEDS)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
    public void create(FeedsDto feedsDto){ 
		feedsDto.setImageUrl("www.google.com");
		feedsService.create(feedsDto);
    }
	
	@GetMapping(ConfigMain.GET_ALL_FEEDS)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public List<Feeds> getAllFeeds() {
		return feedsService.getAllFeeds();
	}
	
	@GetMapping(ConfigMain.GET_FEED_VIA_FEED_ID)
	@CrossOrigin(origins = ConfigMain.ANGULAR_URL)
	public Optional<Feeds> getFeed(@PathVariable("feedId") int feedId) {
		return feedsService.getFeed(feedId);
	}
}
