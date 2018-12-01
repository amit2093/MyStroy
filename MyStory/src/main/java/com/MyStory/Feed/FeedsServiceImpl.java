package com.MyStory.Feed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedsServiceImpl implements FeedsService{
	
	@Autowired
	private FeedsRepository feedsRepository;
	
	@Override
	public Feeds create(FeedsDto feedsDto) {
		Feeds feeds = new Feeds();
		feeds.setImageUrl(feedsDto.getImageUrl());
		return feedsRepository.save(feeds);
	}
	
	@Override
	public List<Feeds> getAllFeeds() {
		List<Feeds> feedsList = new ArrayList<Feeds>();
		
		Iterable<Feeds> iterable = feedsRepository.findAll();
		Iterator<Feeds> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Feeds feeds = iterator.next();
			feedsList.add(feeds);
	    }
		
		return feedsList;
	}

	@Override
	public Optional<Feeds> getFeed(int feedId) {
		return feedsRepository.findById(feedId);
	}
}
