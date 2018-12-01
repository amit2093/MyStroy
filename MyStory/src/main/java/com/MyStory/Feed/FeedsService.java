package com.MyStory.Feed;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface FeedsService {

	public Feeds create(FeedsDto feedsDto);
	
	public List<Feeds> getAllFeeds();
	
	public Optional<Feeds> getFeed(int feedId);
}
