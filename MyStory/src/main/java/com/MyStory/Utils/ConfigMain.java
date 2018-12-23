package com.MyStory.Utils;

public class ConfigMain {
	
	public static final String ANGULAR_URL = "http://localhost:4200";
	
	public static final String GET_ALL_FEEDS = "/getAllFeeds";
	public static final String GET_FEED_VIA_FEED_ID = "/getFeed/{feedId}";
	public static final String SAVE_FEEDS = "saveFeeds";
	
	public static final String GET_ALL_COMMENTS = "/getAllComments";
	public static final String SAVE_COMMENT = "/saveComment";
	
	public static final String GET_ALL_PERSONS= "/getAllPersons";
	public static final String SAVE_PERSON = "/savePerson";
	
	
	
	public static final String SAVE_PROFILE = "/saveProfile";
	
	public static final String CREATE_FRIENDSHIP_REQUEST = "/createFriendshipRequest";
	
	public static final String FRIEND_WITH = "/friendWith";
	
	public static final String GET_ALL_FRIENDS_BY_ID = "/getAllFriends/{Profile_Key}";
	
	public static final String GET_PROFILE_BY_ID = "/getProfile/{Profile_Key}";
	
	public static final String GET_ALL_PROFILES_FOR_SEARCH = "/getAllProfiles";
}
