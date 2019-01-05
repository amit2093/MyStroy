package com.MyStory.Feed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyStory.Profile.Profile;

@Service
public class FeedsServiceImpl implements FeedsService{
	
	@Autowired
	private FeedsRepository feedsRepository;
	
	@Override
	public Feeds create(FeedsDto feedsDto) {
		Profile profile = new Profile();
		profile.setProfile_Key(feedsDto.getFeed_Uploaded_By().getProfile_Key());
		
		Feeds feeds = new Feeds();
		feeds.setFeed_Key(feedsDto.getFeed_Key());
		feeds.setFeed_Title(feedsDto.getFeed_Title());
		feeds.setFeed_Description(feedsDto.getFeed_Description());
		feeds.setTotal_Likes(feedsDto.getTotal_Likes());
		feeds.setFeed_Upload_Date(feedsDto.getFeed_Upload_Date());
		feeds.setFeed_Uploaded_By(profile);
		feeds.setImage_Url(feedsDto.getImage_Url());
		feeds.setIs_Feed_Deleted(feedsDto.isIs_Feed_Deleted());
		feeds.setTotal_Views(feedsDto.getTotal_Views());
		
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
	public Optional<Feeds> getFeed(int feed_key) {
		return feedsRepository.findById(feed_key);
	}
}
