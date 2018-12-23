package com.MyStory.Message;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MessageRepository extends CrudRepository<Message, Integer>{

 	@Query( "SELECT new map( p.Profile_Key AS Profile_Key, "
 			+ "p.Profile_Name AS Profile_Name, "
 			+ "m.Message_Body AS Message_Body, "
 			+ "m.Message_Date AS Message_Date)"
 			+ "FROM Profile p, " 
			+ "Message m WHERE m.Message_From IN (:PersonMessageToSee_Key, :loggedInUserProfileKey) "
			+ "AND m.Message_To IN (:PersonMessageToSee_Key, :loggedInUserProfileKey) "
			+ "AND p.Profile_Key = m.Message_From" )
	public List<?> findMessageById(@Param("PersonMessageToSee_Key") int PersonMessageToSee_Key,
								   @Param("loggedInUserProfileKey") int loggedInUserProfileKey);
	
	
 	
 	@Query( "SELECT DISTINCT "
 			+ "new map( p.Profile_Key AS Profile_Key, "
 			+ "p.Profile_Name AS Profile_Name)"
 			+ "FROM Profile p, " 
 		    + "Message m WHERE m.Message_To = :loggedInUserProfileKey "
 		    + "AND p.Profile_Key = m.Message_From "
 		    + "ORDER BY m.Message_Date DESC" )
 	public List<?> getAllChats(int loggedInUserProfileKey);
 	
 	
 	
 	@Query( "SELECT new map(p.Profile_Key AS Profile_Key, "
 			+ "p.Profile_Name AS Profile_Name) "
 			+ "FROM Profile p, " 
 			+ "Friend_With f WHERE f.Profile_Key = :loggedInUserProfileKey "
 			+ "AND p.Profile_Key = f.Friend_To")
 	public List<?> getAllOnlineFriends(@Param("loggedInUserProfileKey") int loggedInUserProfileKey);
}
