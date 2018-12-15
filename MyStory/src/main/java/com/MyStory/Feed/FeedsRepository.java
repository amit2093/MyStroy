package com.MyStory.Feed;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FeedsRepository  extends CrudRepository<Feeds, Integer>{
	
}
