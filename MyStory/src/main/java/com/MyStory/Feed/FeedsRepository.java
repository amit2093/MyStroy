package com.MyStory.Feed;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FeedsRepository  extends CrudRepository<Feeds, Integer>{
	
	@Query(value = "SELECT f FROM Feeds f"
			+ " WHERE f.Feed_Uploaded_By.Profile_Key = :ProfileKey")
	List<Feeds> getAllFeedsByProfileKey(int ProfileKey);
}
