package com.MyStory.Feed;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface FeedsService {

	public Feeds create(FeedsDto feedsDto);
	
	public List<Feeds> getAllFeeds();
	
	public List<Feeds> getAllFeedsByProfileKey(int Profile_Key);
	
	public Optional<Feeds> getFeed(int feedId);
}
