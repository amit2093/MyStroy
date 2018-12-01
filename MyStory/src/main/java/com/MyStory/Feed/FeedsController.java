package com.MyStory.Feed;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedsController {

	@Autowired
	private FeedsService feedsService;
	
	@GetMapping("/saveFeeds")
    public void create(FeedsDto feedsDto){ 
		feedsDto.setImageUrl("www.google.com");
		feedsService.create(feedsDto);
    }
	
	@GetMapping("/getAllFeeds")
	public List<Feeds> getAllFeeds() {
		return feedsService.getAllFeeds();
	}
	
	@GetMapping("/getFeed/{feedId}")
	public Optional<Feeds> getFeed(@PathVariable("feedId") int feedId) {
		return feedsService.getFeed(feedId);
	}
}
