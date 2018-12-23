package com.MyStory.Profile;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProfileRepository extends CrudRepository<Profile, Integer>{

	@Query(value = "SELECT p FROM Profile p WHERE p.Profile_Key = :Profile_Key")
	Profile getProfileById(@Param("Profile_Key") int Profile_Key);
	
	@Query("SELECT new map (p.Profile_Name AS Profile_Name, p.Profile_Key AS Profile_Key) "
			+ "FROM Profile p")
	List<Profile> getAllProfiles();
}