package com.MyStory.Friends;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface Friendship_RequestRepository extends CrudRepository<Friendship_Request, Integer>{

	@Query("SELECT p.Profile_Name FROM Profile p WHERE p.Profile_Key IN "
			+ "(SELECT f.Friend_To FROM Friend_With f WHERE f.Profile_Key = :Profile_Key)")
	public List<Friendship_Request> getAllFriends(@Param("Profile_Key") int Profile_Key);
}
